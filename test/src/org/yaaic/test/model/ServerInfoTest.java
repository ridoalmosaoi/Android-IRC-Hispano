/*
Yaaic - Yet Another Android IRC Client

Copyright 2009-2010 Sebastian Kaspari

This file is part of Yaaic.

Yaaic is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Yaaic is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Yaaic.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.irchispano.test.model;

import org.irchispano.model.ServerInfo;
import org.irchispano.model.Conversation;

import junit.framework.TestCase;

/**
 * Test case for org.yaaic.model.ServerInfo
 * 
 * @author Sebastian Kaspari <sebastian@yaaic.org>
 */
public class ServerInfoTest extends TestCase
{
	private ServerInfo serverInfo;
	
	@Override
	protected void setUp()
	{
		this.serverInfo = new ServerInfo();
	}

	public void testGetType()
	{
		assertEquals(Conversation.TYPE_SERVER, serverInfo.getType());
	}
	
	public void testInheritance()
	{
		assertTrue(serverInfo instanceof Conversation);
	}
}
