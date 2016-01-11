//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: OrakKnife
// Model Creator: 
// Created on: 02.01.2016 - 17:49:23
// Last changed on: 02.01.2016 - 17:49:23

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOrakKnife extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelOrakKnife() //Same as Filename
	{
		defaultGripModel = new ModelRendererTurbo[3];
		defaultGripModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // guard
		defaultGripModel[1] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // hande
		defaultGripModel[2] = new ModelRendererTurbo(this, 13, 13, textureX, textureY); // blade

		defaultGripModel[0].addBox(0.5F, -3F, -0.5F, 2, 1, 1, 0F); // guard
		defaultGripModel[0].setRotationPoint(0F, 0F, 0F);

		defaultGripModel[1].addBox(1F, -2F, -0.5F, 1, 4, 1, 0F); // hande
		defaultGripModel[1].setRotationPoint(0F, 0F, 0F);

		defaultGripModel[2].addBox(0F, -8F, 0F, 3, 5, 0, 0F); // blade
		defaultGripModel[2].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}