/* ======================================================================================================
 * SystemDynamics: Java application for modeling, visualization and execution of System Dynamics models
 * ======================================================================================================
 *
 * (C) Copyright 2007-2008, Joachim Melcher, Institut AIFB, Universitaet Karlsruhe (TH), Germany
 *
 * Project Info:  http://sourceforge.net/projects/system-dynamics
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */

package de.uka.aifb.com.systemDynamics.gui.systemDynamicsGraph;

import org.jgraph.graph.*;

/**
 * This class implements a System Dynamics edge view.
 * <p>
 * This edge view's handles use Shift+mouse click for adding or removing additional
 * control points of an edge.
 * 
 * @author Joachim Melcher, Institut AIFB, Universitaet Karlsruhe (TH), Germany
 * @version 1.0
 */
public class SystemDynamicsEdgeView extends EdgeView {
   
   private static final long serialVersionUID = 1L;
   
   /**
    * Constructor.
    * 
    * @param cell edge
    */
   public SystemDynamicsEdgeView(Object cell) {
      super(cell);
   }
   
   /**
    * Gets the edge view's handle. This handle use Shift+mouse click for adding or
    * removing additional control points of an edge.
    * 
    * @param context graph context
    * @return cell handle
    */
   @Override
public CellHandle getHandle(GraphContext context) {
      return new ShiftEdgeHandle(this, context);
   }
}