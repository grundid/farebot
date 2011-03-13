/*
 * Trip.java
 *
 * Copyright (C) 2011 Eric Butler
 *
 * Authors:
 * Eric Butler <eric@codebutler.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.farebot.transit;

public abstract class Trip
{
    public abstract long getTimestamp();
    public abstract String getRouteName ();
    public abstract String getAgencyName ();
    public abstract String getShortAgencyName ();
    public abstract String getFareString ();
    public abstract String getBalanceString ();
    public abstract String getStartStationName ();
    public abstract Station getStartStation ();
    public abstract String getEndStationName ();
    public abstract Station getEndStation ();
    public abstract double getFare ();
}