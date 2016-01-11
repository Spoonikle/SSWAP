//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RibbonDevice
// Model Creator: 
// Created on: 22.12.2015 - 14:02:29
// Last changed on: 22.12.2015 - 14:02:29

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRibbonDevice extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelRibbonDevice() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // fingerJoint
		gunModel[1] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // fingerJoint2
		gunModel[2] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // fingerJoint 3
		gunModel[3] = new ModelRendererTurbo(this, 19, 1, textureX, textureY); // thumbJoint1
		gunModel[4] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // thumbJoint2
		gunModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // knuckleRing
		gunModel[6] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // knuckleRing1
		gunModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // knuckleRing2
		gunModel[8] = new ModelRendererTurbo(this, 6, 9, textureX, textureY); // knuckleRing3
		gunModel[9] = new ModelRendererTurbo(this, 11, 8, textureX, textureY); // thumb
		gunModel[10] = new ModelRendererTurbo(this, 16, 8, textureX, textureY); // finger1
		gunModel[11] = new ModelRendererTurbo(this, 21, 8, textureX, textureY); // finger2
		gunModel[12] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // finger3

		gunModel[0].addBox(2.5F, -4.5F, 0F, 1, 4, 0, 0F); // fingerJoint
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(2.5F, -4.5F, 1.5F, 1, 4, 0, 0F); // fingerJoint2
		gunModel[1].setRotationPoint(0F, 0F, 0F);
		gunModel[1].rotateAngleX = -0.26179939F;

		gunModel[2].addBox(2.5F, -4.5F, -1.5F, 1, 4, 0, 0F); // fingerJoint 3
		gunModel[2].setRotationPoint(0F, 0F, 0F);
		gunModel[2].rotateAngleX = 0.26179939F;

		gunModel[3].addBox(2.5F, -2.7F, 4.5F, 1, 2, 0, 0F); // thumbJoint1
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		gunModel[3].rotateAngleX = -0.26179939F;

		gunModel[4].addBox(2.5F, 0.5F, 1.5F, 1, 0, 3, 0F); // thumbJoint2
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(2F, -3.5F, -0.5F, 1, 1, 1, 0F); // knuckleRing
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(2F, -3.5F, -2F, 1, 1, 1, 0F); // knuckleRing1
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		gunModel[6].rotateAngleX = 0.26179939F;

		gunModel[7].addBox(2F, -3.5F, 1F, 1, 1, 1, 0F); // knuckleRing2
		gunModel[7].setRotationPoint(0F, 0F, 0F);
		gunModel[7].rotateAngleX = -0.26179939F;

		gunModel[8].addBox(2F, 0F, 3F, 1, 1, 1, 0F); // knuckleRing3
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addBox(2F, -3F, 4F, 1, 2, 1, 0F); // thumb
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		gunModel[9].rotateAngleX = -0.26179939F;
		gunModel[9].rotateAngleY = -0.10471976F;

		gunModel[10].addBox(2F, -6.5F, 1F, 1, 2, 1, 0F); // finger1
		gunModel[10].setRotationPoint(0F, 0F, 0F);
		gunModel[10].rotateAngleX = -0.26179939F;
		gunModel[10].rotateAngleZ = -0.10471976F;

		gunModel[11].addBox(2F, -6.5F, -0.5F, 1, 2, 1, 0F); // finger2
		gunModel[11].setRotationPoint(0F, 0F, 0F);
		gunModel[11].rotateAngleZ = -0.08726646F;

		gunModel[12].addBox(2F, -6.5F, -2F, 1, 2, 1, 0F); // finger3
		gunModel[12].setRotationPoint(0F, 0F, 0F);
		gunModel[12].rotateAngleX = 0.26179939F;
		gunModel[12].rotateAngleZ = -0.08726646F;


		defaultBarrelModel = new ModelRendererTurbo[2];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 12, 3, textureX, textureY); // gem
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // socket

		defaultBarrelModel[0].addBox(4F, -1F, -1F, 1, 2, 2, 0F); // gem
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[1].addBox(3F, -1.5F, -1.5F, 1, 3, 3, 0F); // socket
		defaultBarrelModel[1].setRotationPoint(0F, 0F, 0F);


		defaultStockModel = new ModelRendererTurbo[4];
		defaultStockModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 20
		defaultStockModel[1] = new ModelRendererTurbo(this, 3, 14, textureX, textureY); // Box 21
		defaultStockModel[2] = new ModelRendererTurbo(this, 2, 16, textureX, textureY); // Box 22
		defaultStockModel[3] = new ModelRendererTurbo(this, 3, 14, textureX, textureY); // Box 23

		defaultStockModel[0].addBox(-2F, 3F, -4F, 2, 1, 9, 0F); // Box 20
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);
		defaultStockModel[0].rotateAngleY = -0.29670597F;

		defaultStockModel[1].addBox(-2F, -3F, -4F, 2, 6, 1, 0F); // Box 21
		defaultStockModel[1].setRotationPoint(0F, 0F, 0F);
		defaultStockModel[1].rotateAngleY = -0.29670597F;

		defaultStockModel[2].addBox(-4F, -4F, -3F, 2, 1, 7, 0F); // Box 22
		defaultStockModel[2].setRotationPoint(0F, 0F, 0F);
		defaultStockModel[2].rotateAngleY = 0.26179939F;

		defaultStockModel[3].addBox(-4F, -4F, 4F, 2, 8, 1, 0F); // Box 23
		defaultStockModel[3].setRotationPoint(0F, 0F, 0F);
		defaultStockModel[3].rotateAngleY = 0.26179939F;


		defaultGripModel = new ModelRendererTurbo[4];
		defaultGripModel[0] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // thumbring
		defaultGripModel[1] = new ModelRendererTurbo(this, 7, 20, textureX, textureY); // thumbring2
		defaultGripModel[2] = new ModelRendererTurbo(this, 7, 20, textureX, textureY); // thumbring3
		defaultGripModel[3] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // thumbring4

		defaultGripModel[0].addBox(3F, -1F, -1F, 1, 5, 1, 0F); // thumbring
		defaultGripModel[0].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[0].rotateAngleY = 0.61086524F;

		defaultGripModel[1].addBox(3F, -1F, 0F, 1, 1, 3, 0F); // thumbring2
		defaultGripModel[1].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[1].rotateAngleY = 0.61086524F;

		defaultGripModel[2].addBox(3F, 3F, 0F, 1, 1, 3, 0F); // thumbring3
		defaultGripModel[2].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[2].rotateAngleY = 0.61086524F;

		defaultGripModel[3].addBox(3F, -1F, 3F, 1, 5, 1, 0F); // thumbring4
		defaultGripModel[3].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[3].rotateAngleY = 0.61086524F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}