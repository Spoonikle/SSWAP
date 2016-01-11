//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: wraithStunnner
// Model Creator: 
// Created on: 14.12.2015 - 22:33:26
// Last changed on: 14.12.2015 - 22:33:26

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWraithStunner extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelWraithStunner() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Shape0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // grip

		gunModel[0].addShape3D(11F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(1, 1, 1, 1), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 2, 10, 10, 14, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4 ,2}); // Import Shape0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(3F, -3F, -1F, 4, 3, 2, 0F); // Box 0
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addBox(0F, 0.9F, -0.5F, 3, 1, 1, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addBox(1.2F, 2.35F, -0.5F, 4, 1, 1, 0F); // Box 3
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		gunModel[3].rotateAngleZ = 0.64577182F;

		gunModel[4].addBox(3F, -3F, 1.1F, 3, 2, 0, 0F); // Box 4
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(3F, -3F, -1.1F, 3, 2, 0, 0F); // Box 5
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(-0.75F, 0F, -1F, 5, 2, 2, 0F); // grip
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		gunModel[6].rotateAngleZ = 0.78539816F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}