/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package jsr223.cpython.entrypoint;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.script.Bindings;
import javax.script.SimpleBindings;


/**
 * @author ActiveEon Team
 * @since 05/10/2017
 */
public class EntryPoint {
    /**
     * Singleton
     */
    private static EntryPoint ourInstance = new EntryPoint();

    private EntryPoint() {
    }

    public static EntryPoint getInstance() {
        return ourInstance;
    }

    private Map<String, Serializable> variables = new HashMap<>();

    private Bindings bindings = new SimpleBindings();

    //Add the objects to the gateway server
    //TODO not sure we still need this getVariables() because we already have the getBindings() whtich contains all
    public Map getVariables() {
        return variables;
    }

    public Bindings getBindings() {
        return bindings;
    }
}
