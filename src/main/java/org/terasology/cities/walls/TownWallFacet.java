/*
 * Copyright 2015 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.cities.walls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.terasology.math.Region3i;
import org.terasology.world.generation.Border3D;
import org.terasology.world.generation.facets.base.BaseFacet2D;

/**
 * A registry for town walls.
 */
public class TownWallFacet extends BaseFacet2D {

    private final Collection<TownWall> walls = new ArrayList<>();

    public TownWallFacet(Region3i targetRegion, Border3D border) {
        super(targetRegion, border);
    }

    public void addTownWall(TownWall area) {
        walls.add(area);
    }

    public Collection<TownWall> getTownWalls() {
        return Collections.unmodifiableCollection(walls);
    }
}
