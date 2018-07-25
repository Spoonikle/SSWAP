//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F-302
// Model Creator: Spoonikle
// Created on: 04.07.2018 - 15:12:41
// Last changed on: 04.07.2018 - 15:12:41

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF302 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelF302() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // belly
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // belly2
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // belly3
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // belly4
		bodyModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // body1
		bodyModel[5] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // body3
		bodyModel[6] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // body4
		bodyModel[7] = new ModelRendererTurbo(this, 2, 83, textureX, textureY); // cockpitbody2
		bodyModel[8] = new ModelRendererTurbo(this, 2, 86, textureX, textureY); // Fusealge2
		bodyModel[9] = new ModelRendererTurbo(this, 2, 80, textureX, textureY); // cockpitbody1
		bodyModel[10] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Fusealge3
		bodyModel[11] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Fusealge4
		bodyModel[12] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Fusealge5
		bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Fusealge6
		bodyModel[14] = new ModelRendererTurbo(this, 2, 77, textureX, textureY); // Fusealge1
		bodyModel[15] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Fusealge7
		bodyModel[16] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Fusealge8
		bodyModel[17] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Fusealge9
		bodyModel[18] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Fusealge10
		bodyModel[19] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Fusealge11
		bodyModel[20] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Fusealge12
		bodyModel[21] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Fusealge13
		bodyModel[22] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Fusealge14
		bodyModel[23] = new ModelRendererTurbo(this, 617, 56, textureX, textureY); // body2
		bodyModel[24] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // body5
		bodyModel[25] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // booster1
		bodyModel[26] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // booster2
		bodyModel[27] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // booster3
		bodyModel[28] = new ModelRendererTurbo(this, 0, 174, textureX, textureY); // booster4
		bodyModel[29] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster5
		bodyModel[30] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster6
		bodyModel[31] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster7
		bodyModel[32] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster8
		bodyModel[33] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster9
		bodyModel[34] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster10
		bodyModel[35] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster11
		bodyModel[36] = new ModelRendererTurbo(this, 126, 181, textureX, textureY); // booster12
		bodyModel[37] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster13
		bodyModel[38] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster14
		bodyModel[39] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster15
		bodyModel[40] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster16
		bodyModel[41] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster17
		bodyModel[42] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster18
		bodyModel[43] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster19
		bodyModel[44] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster20
		bodyModel[45] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster21
		bodyModel[46] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster22
		bodyModel[47] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster23
		bodyModel[48] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster24
		bodyModel[49] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster25
		bodyModel[50] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster26
		bodyModel[51] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster27
		bodyModel[52] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster28
		bodyModel[53] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster29
		bodyModel[54] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster30
		bodyModel[55] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // booster31
		bodyModel[56] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // Box 109
		bodyModel[57] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // Box 110
		bodyModel[58] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // Box 111
		bodyModel[59] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // Box 112
		bodyModel[60] = new ModelRendererTurbo(this, 81, 180, textureX, textureY); // Box 113

		bodyModel[0].addShapeBox(0F, 0F, 0F, 36, 3, 14, 0F, 16F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 16F, 0F, 0F, 9F, -0.5F, -2F, 0F, 1F, 1F, 0F, 1F, 1F, 9F, -0.5F, -2F); // belly
		bodyModel[0].setRotationPoint(-13F, -26F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 4, 14, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 0F, 1F); // belly2
		bodyModel[1].setRotationPoint(23F, -26F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 36, 5, 0, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 3F, 1F, 0F, 3F, 7F, 0F, 0F, 7F); // belly3
		bodyModel[2].setRotationPoint(49F, -26F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 5, 0, 0F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 7F, 0F, 3F, 7F, 0F, 3F, 2F, 0F, 0F, 3F); // belly4
		bodyModel[3].setRotationPoint(49F, -26F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 32, 12, 20, 0F, 0F, 0F, 0F, 0F, -9F, -12F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0.85F, 0.6F, 0F); // body1
		bodyModel[4].setRotationPoint(56F, -38F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 101, 6, 16, 0F, 0F, 0F, 0F, -0.5F, 7F, 3.9F, -0.5F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // body3
		bodyModel[5].setRotationPoint(-44.5F, -31F, -16F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 101, 6, 16, 0F, 0F, 0F, 0F, -0.5F, 7F, 0F, -0.5F, 7F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // body4
		bodyModel[6].setRotationPoint(-44.5F, -31F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -10F, 2F, 1F, 52F, 11.5F, 4F, 44F, 0F, -5F, -6F, 0F, 1F, 0F, -1F, 0F, 52F, -2.5F, 13F, 44F, 0F, -5F, -2F, 0F, 0F); // cockpitbody2
		bodyModel[7].setRotationPoint(-67F, -30.5F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 1.5F, 16.5F, 10.7F, 2.5F, 16.5F, 11F, 2F, 0F, 0F, 0F, 0F, 0F, 1.5F, 16.5F, -2.05F, 8.95F, 16.5F, 0F, 2.5F, 0F, 0F, 0F); // Fusealge2
		bodyModel[8].setRotationPoint(-32F, -31.5F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -6F, 0F, 1F, 44F, 0F, -5F, 52F, 11.5F, 4F, -10F, 2F, 1F, -2F, 0F, 0F, 44F, 0F, -5F, 52F, -2.5F, 13F, 0F, -1F, 0F); // cockpitbody1
		bodyModel[9].setRotationPoint(-67F, -30.5F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F); // Fusealge3
		bodyModel[10].setRotationPoint(-14.5F, -50.5F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F); // Fusealge4
		bodyModel[11].setRotationPoint(-14.5F, -50.5F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Fusealge5
		bodyModel[12].setRotationPoint(-14.5F, -53.5F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Fusealge6
		bodyModel[13].setRotationPoint(-14.5F, -53.5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 16.5F, 11F, 2F, 16.5F, 10.7F, 2.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 16.5F, 0F, 2.5F, 16.5F, -2.05F, 8.95F, 0F, 0F, 1.5F); // Fusealge1
		bodyModel[14].setRotationPoint(-32F, -31.5F, 14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Fusealge7
		bodyModel[15].setRotationPoint(1.5F, -53.5F, 0F);
		bodyModel[15].rotateAngleZ = -0.2268928F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Fusealge8
		bodyModel[16].setRotationPoint(1.5F, -53.5F, -8F);
		bodyModel[16].rotateAngleZ = -0.2268928F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 18, 12, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F, 12F); // Fusealge9
		bodyModel[17].setRotationPoint(1.5F, -50.5F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 18, 12, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 9.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Fusealge10
		bodyModel[18].setRotationPoint(1.5F, -50.5F, -12F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 31, 12, 12, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Fusealge11
		bodyModel[19].setRotationPoint(17.5F, -46F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 31, 12, 12, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Fusealge12
		bodyModel[20].setRotationPoint(17.5F, -46F, -12F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 31, 11, 7, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Fusealge13
		bodyModel[21].setRotationPoint(17.5F, -47.5F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 31, 11, 7, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Fusealge14
		bodyModel[22].setRotationPoint(17.5F, -47.5F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 32, 12, 20, 0F, 0F, 0F, 0F, 0F, -9F, -12F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0.85F, 0.6F, 0F); // body2
		bodyModel[23].setRotationPoint(56F, -38F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 32, 12, 20, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -12F, 0F, 0F, 0F, 0.85F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F); // body5
		bodyModel[24].setRotationPoint(56F, -38F, -20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 8, 10, 0F, 2F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 2F, -1F, 0F, 0F, 0F, 6F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 6F); // booster1
		bodyModel[25].setRotationPoint(56F, -39F, -5F);

		bodyModel[26].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(8, 0, 8, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 14, 22, 14), new Coord2D(16, 20, 16, 20), new Coord2D(8, 20, 8, 20), new Coord2D(2, 14, 2, 14), new Coord2D(2, 6, 2, 6) }), 5, 20, 20, 68, 5, ModelRendererTurbo.MR_FRONT, new float[] {9 ,8 ,9 ,8 ,9 ,8 ,9 ,8}); // booster2
		bodyModel[26].setRotationPoint(73F, -19F, -12F);
		bodyModel[26].rotateAngleY = -1.57079633F;

		bodyModel[27].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(8, 0, 8, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 14, 22, 14), new Coord2D(16, 20, 16, 20), new Coord2D(8, 20, 8, 20), new Coord2D(2, 14, 2, 14), new Coord2D(2, 6, 2, 6) }), 6, 20, 20, 68, 6, ModelRendererTurbo.MR_FRONT, new float[] {9 ,8 ,9 ,8 ,9 ,8 ,9 ,8}); // booster3
		bodyModel[27].setRotationPoint(79F, -20F, -12F);
		bodyModel[27].rotateAngleY = -1.57079633F;

		bodyModel[28].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(8, 0, 8, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 14, 22, 14), new Coord2D(16, 20, 16, 20), new Coord2D(8, 20, 8, 20), new Coord2D(2, 14, 2, 14), new Coord2D(2, 6, 2, 6) }), 6, 20, 20, 68, 6, ModelRendererTurbo.MR_FRONT, new float[] {9 ,8 ,9 ,8 ,9 ,8 ,9 ,8}); // booster4
		bodyModel[28].setRotationPoint(85F, -15F, -7F);
		bodyModel[28].rotateAngleX = -0.01745329F;
		bodyModel[28].rotateAngleY = -1.57079633F;
		bodyModel[28].rotateAngleZ = -0.40142573F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster5
		bodyModel[29].setRotationPoint(84F, -34F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster6
		bodyModel[30].setRotationPoint(84F, -26F, 10F);
		bodyModel[30].rotateAngleX = -0.78539816F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster7
		bodyModel[31].setRotationPoint(84F, -20F, 5F);
		bodyModel[31].rotateAngleX = -1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster8
		bodyModel[32].setRotationPoint(84F, -19F, -3F);
		bodyModel[32].rotateAngleX = -2.35619449F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster9
		bodyModel[33].setRotationPoint(84F, -24F, -9F);
		bodyModel[33].rotateAngleX = -3.14159265F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster10
		bodyModel[34].setRotationPoint(84F, -32F, -10F);
		bodyModel[34].rotateAngleX = -3.92699082F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster11
		bodyModel[35].setRotationPoint(84F, -38F, -5F);
		bodyModel[35].rotateAngleX = -4.71238898F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster12
		bodyModel[36].setRotationPoint(84F, -39F, 3F);
		bodyModel[36].rotateAngleX = -5.49778714F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster13
		bodyModel[37].setRotationPoint(89F, -26F, 10F);
		bodyModel[37].rotateAngleX = -0.78539816F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster14
		bodyModel[38].setRotationPoint(89F, -20F, 5F);
		bodyModel[38].rotateAngleX = -1.57079633F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster15
		bodyModel[39].setRotationPoint(89F, -19F, -3F);
		bodyModel[39].rotateAngleX = -2.35619449F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster16
		bodyModel[40].setRotationPoint(89F, -24F, -9F);
		bodyModel[40].rotateAngleX = -3.14159265F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster17
		bodyModel[41].setRotationPoint(89F, -32F, -10F);
		bodyModel[41].rotateAngleX = -3.92699082F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster18
		bodyModel[42].setRotationPoint(89F, -38F, -5F);
		bodyModel[42].rotateAngleX = -4.71238898F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster19
		bodyModel[43].setRotationPoint(89F, -39F, 3F);
		bodyModel[43].rotateAngleX = -5.49778714F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // booster20
		bodyModel[44].setRotationPoint(89F, -34F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster21
		bodyModel[45].setRotationPoint(94F, -39F, 3F);
		bodyModel[45].rotateAngleX = -5.49778714F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster22
		bodyModel[46].setRotationPoint(94F, -38F, -5F);
		bodyModel[46].rotateAngleX = -4.71238898F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster23
		bodyModel[47].setRotationPoint(94F, -32F, -10F);
		bodyModel[47].rotateAngleX = -3.92699082F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster24
		bodyModel[48].setRotationPoint(94F, -24F, -9F);
		bodyModel[48].rotateAngleX = -3.14159265F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster25
		bodyModel[49].setRotationPoint(94F, -19F, -3F);
		bodyModel[49].rotateAngleX = -2.35619449F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster26
		bodyModel[50].setRotationPoint(94F, -20F, 5F);
		bodyModel[50].rotateAngleX = -1.57079633F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster27
		bodyModel[51].setRotationPoint(94F, -26F, 10F);
		bodyModel[51].rotateAngleX = -0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster28
		bodyModel[52].setRotationPoint(94F, -34F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster29
		bodyModel[53].setRotationPoint(99F, -38F, -5F);
		bodyModel[53].rotateAngleX = -4.71238898F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster30
		bodyModel[54].setRotationPoint(99F, -32F, -10F);
		bodyModel[54].rotateAngleX = -3.92699082F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // booster31
		bodyModel[55].setRotationPoint(99F, -24F, -9F);
		bodyModel[55].rotateAngleX = -3.14159265F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[56].setRotationPoint(99F, -20F, 5F);
		bodyModel[56].rotateAngleX = -1.57079633F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[57].setRotationPoint(99F, -19F, -3F);
		bodyModel[57].rotateAngleX = -2.35619449F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[58].setRotationPoint(99F, -26F, 10F);
		bodyModel[58].rotateAngleX = -0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[59].setRotationPoint(99F, -34F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[60].setRotationPoint(99F, -39F, 3F);
		bodyModel[60].rotateAngleX = -5.49778714F;


		noseModel = new ModelRendererTurbo[1];
		noseModel[0] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Nose1

		noseModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 16, 0F, 0F, -0.5F, 0F, 21.5F, 0F, 8F, 21.5F, 0F, 8F, 0F, -0.5F, 0F, -4F, -0.5F, 0.75F, 21.5F, 1F, 8F, 21.5F, 1F, 8F, -4F, -0.5F, 0.75F); // Nose1
		noseModel[0].setRotationPoint(-67F, -31F, -8F);


		tailModel = new ModelRendererTurbo[4];
		tailModel[0] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // tailLeft
		tailModel[1] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // tailRight
		tailModel[2] = new ModelRendererTurbo(this, -1, 207, textureX, textureY); // Box 148
		tailModel[3] = new ModelRendererTurbo(this, -202, 208, textureX, textureY); // Box 149

		tailModel[0].addShapeBox(0F, 0F, 0F, 20, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 21F, 0F, 0F); // tailLeft
		tailModel[0].setRotationPoint(36F, -57F, -35F);
		tailModel[0].rotateAngleX = 0.36651914F;

		tailModel[1].addShapeBox(0F, 0F, 0F, 20, 28, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 21F, 0F, 0F); // tailRight
		tailModel[1].setRotationPoint(36F, -57F, 34F);
		tailModel[1].rotateAngleX = -0.36651914F;

		tailModel[2].addShapeBox(0F, 0F, 0F, 200, 200, 1, 0F, 0F, 0F, 0F, -190F, 0F, 0F, -190F, 0F, 0F, 0F, 0F, 0F, 0F, -190F, 0F, -190F, -190F, 0F, -190F, -190F, 0F, 0F, -190F, 0F); // Box 148
		tailModel[2].setRotationPoint(36F, -53F, -34F);
		tailModel[2].rotateAngleX = 0.36651914F;

		tailModel[3].addShapeBox(0F, 0F, 0F, 200, 200, 1, 0F, 0F, 0F, 0F, -190F, 0F, 0F, -190F, 0F, 0F, 0F, 0F, 0F, 0F, -190F, 0F, -190F, -190F, 0F, -190F, -190F, 0F, 0F, -190F, 0F); // Box 149
		tailModel[3].setRotationPoint(36F, -53F, 33F);
		tailModel[3].rotateAngleX = -0.36651914F;


		leftWingModel = new ModelRendererTurbo[24];
		leftWingModel[0] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // wingLeft1
		leftWingModel[1] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // wingLeft2
		leftWingModel[2] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // wingLeft3
		leftWingModel[3] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // wingLeft4
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // wingFlap2
		leftWingModel[5] = new ModelRendererTurbo(this, 928, 25, textureX, textureY); // wingFlapTip2
		leftWingModel[6] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // wingLeft5
		leftWingModel[7] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // engineLeft1
		leftWingModel[8] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // engineLeft2
		leftWingModel[9] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // engineLeft3
		leftWingModel[10] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // engineLeft4
		leftWingModel[11] = new ModelRendererTurbo(this, 681, 137, textureX, textureY); // engineLeft5
		leftWingModel[12] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // engineLeft6
		leftWingModel[13] = new ModelRendererTurbo(this, 913, 153, textureX, textureY); // engineLeft7
		leftWingModel[14] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // engineLeft8
		leftWingModel[15] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft9
		leftWingModel[16] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft10
		leftWingModel[17] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft11
		leftWingModel[18] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft12
		leftWingModel[19] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft13
		leftWingModel[20] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft15
		leftWingModel[21] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft16
		leftWingModel[22] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineLeft14
		leftWingModel[23] = new ModelRendererTurbo(this, 976, 43, textureX, textureY); // engineLeft17

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 100, 6, 22, 0F, 1.5F, -4.5F, 0F, -8.5F, 0.5F, 2F, 1F, 7F, -4F, 3F, -0.25F, 1.15F, -0.5F, 2F, 0F, -8.5F, 3F, 2F, 2F, -1F, 0F, 0F, 0F, 0F); // wingLeft1
		leftWingModel[0].setRotationPoint(-45F, -31F, -38F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 91, 5, 14, 0F, -6F, -3.5F, 0.5F, -9F, 0F, 0.5F, 0.5F, 4.5F, -2F, 1.5F, -0.5F, 0F, -8F, 1.5F, 0.5F, -9F, 4F, 0.5F, 0.5F, 0F, -2F, -0.5F, -1F, 0F); // wingLeft2
		leftWingModel[1].setRotationPoint(-45F, -27F, -52F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 76, 4, 88, 0F, 12.5F, -30.5F, -2.5F, -61F, -29F, -2.5F, 0F, 3.5F, 0F, 0F, 0F, 0F, 11F, 28F, -2.5F, -61F, 27.5F, -3F, 0F, 1.5F, 0F, -2F, -1F, 0F); // wingLeft3
		leftWingModel[2].setRotationPoint(-39F, -23.5F, -140.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 29, 9, 29, 0F, 21F, -10.5F, 0F, -30F, -17F, 0F, -4.5F, -7.5F, 0F, 0F, 0.5F, 0F, 21F, 8.5F, 0F, -30F, 9F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F); // wingLeft4
		leftWingModel[3].setRotationPoint(37F, -26.5F, -81.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 20, 8, 50, 0F, 35.35F, -19F, 0F, -43F, -21F, 0F, 0F, -6.45F, 0F, 0F, 0F, 0F, 35.7F, 14.15F, 0F, -43F, 14F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // wingFlap2
		leftWingModel[4].setRotationPoint(16F, -16F, -131.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F, 4.05F, -2.55F, 0.45F, -10.05F, -3.75F, 0F, -4.95F, -1.95F, 0F, -0.6F, -0.15F, 0F, 4.05F, 0F, 0F, -10.05F, 0F, 0F, -5.1F, -1.95F, 0F, -0.6F, -1.95F, 0F); // wingFlapTip2
		leftWingModel[5].setRotationPoint(-20F, 3F, -137.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 33, 12, 22, 0F, 10.8F, -7.2F, 0F, -20F, -15.25F, 0F, -1.05F, -9F, 0F, 0F, 0F, 0F, 10.8F, 4.65F, 0F, -20F, 5.15F, 0F, -1.05F, 0F, 0F, 0.7F, 0.75F, 0F); // wingLeft5
		leftWingModel[6].setRotationPoint(56F, -38F, -42F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 32, 9, 3, 0F, 16F, 0F, 0F, 23F, -0.6F, 2.1F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -0.3F, 0.4F, 20F, 0F, 3.3F, 0F, 0F, 0F, 0F, 0F, 0F); // engineLeft1
		leftWingModel[7].setRotationPoint(4F, -23F, -36F);
		leftWingModel[7].rotateAngleX = -0.19198622F;

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 32, 14, 3, 0F, 16F, -2F, 0F, 20F, -4.9F, 1.1F, 0F, 1F, -1F, 0F, 1F, -1F, 16F, -2F, 0F, 23F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F); // engineLeft2
		leftWingModel[8].setRotationPoint(4F, -15F, -36F);
		leftWingModel[8].rotateAngleX = -1.34390352F;

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 32, 9, 3, 0F, 16F, -0.1F, 0.5F, 23F, -2F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 19.1F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // engineLeft3
		leftWingModel[9].setRotationPoint(4F, -12F, -48F);
		leftWingModel[9].rotateAngleX = -2.46091425F;

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 21, 8, 15, 0F, 0F, 0F, -2F, 0F, 0F, -3.8F, 0F, 0F, 0.4F, 0F, 0F, 0F, 30F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 30F, 0F, 4F); // engineLeft4
		leftWingModel[10].setRotationPoint(34F, -29F, -55F);
		leftWingModel[10].rotateAngleX = 0.2443461F;

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 12, 8, 15, 0F, 0F, 0F, -3.8F, 0F, 0.4F, -6.2F, 0F, -2.1F, 0F, 0F, 0F, 0.4F, 0F, 0F, 1F, 0F, -1.7F, -0.7F, 0F, 2.7F, 1.1F, 0F, 0F, 2F); // engineLeft5
		leftWingModel[11].setRotationPoint(55F, -29F, -55F);
		leftWingModel[11].rotateAngleX = 0.2443461F;

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 20, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3.5F); // engineLeft6
		leftWingModel[12].setRotationPoint(67F, -23F, -53F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 20, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3.5F); // engineLeft7
		leftWingModel[13].setRotationPoint(67F, -23F, -37F);
		leftWingModel[13].rotateAngleX = 3.14159265F;

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 12, 8, 16, 0F, 0F, -2.1F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.8F, 2F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // engineLeft8
		leftWingModel[14].setRotationPoint(55F, -23F, -53F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft9
		leftWingModel[15].setRotationPoint(87F, -25F, -50F);
		leftWingModel[15].rotateAngleX = -3.92699082F;

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft10
		leftWingModel[16].setRotationPoint(87F, -28F, -47F);
		leftWingModel[16].rotateAngleX = -4.71238898F;

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft11
		leftWingModel[17].setRotationPoint(87F, -25F, -40F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft12
		leftWingModel[18].setRotationPoint(87F, -21F, -40F);
		leftWingModel[18].rotateAngleX = -0.78539816F;

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft13
		leftWingModel[19].setRotationPoint(87F, -18F, -43F);
		leftWingModel[19].rotateAngleX = -1.57079633F;

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft15
		leftWingModel[20].setRotationPoint(87F, -18F, -47F);
		leftWingModel[20].rotateAngleX = -2.35619449F;

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft16
		leftWingModel[21].setRotationPoint(87F, -21F, -50F);
		leftWingModel[21].rotateAngleX = -3.14159265F;

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineLeft14
		leftWingModel[22].setRotationPoint(87F, -28F, -43F);
		leftWingModel[22].rotateAngleX = -5.49778714F;

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // engineLeft17
		leftWingModel[23].setRotationPoint(87F, -25F, -47F);


		rightWingModel = new ModelRendererTurbo[24];
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // wingRight1
		rightWingModel[1] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // wingRight2
		rightWingModel[2] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // wingRight3
		rightWingModel[3] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // wingRight4
		rightWingModel[4] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // wingFlap1
		rightWingModel[5] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // wingFlapTip1
		rightWingModel[6] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // wingRight5
		rightWingModel[7] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // engineRight1
		rightWingModel[8] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // engineRight2
		rightWingModel[9] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // engineRight3
		rightWingModel[10] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // engineRight4
		rightWingModel[11] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // engineRight5
		rightWingModel[12] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // engineRight6
		rightWingModel[13] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // engineRight7
		rightWingModel[14] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // engineRight8
		rightWingModel[15] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight9
		rightWingModel[16] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight10
		rightWingModel[17] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight11
		rightWingModel[18] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight12
		rightWingModel[19] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight13
		rightWingModel[20] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight14
		rightWingModel[21] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight15
		rightWingModel[22] = new ModelRendererTurbo(this, 88, 9, textureX, textureY); // engineRight16
		rightWingModel[23] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // engineRight17

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 100, 6, 22, 0F, 3F, -0.25F, 1.15F, 1F, 7F, -4F, -8.5F, 0.5F, 2F, 1.5F, -4.5F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -8.5F, 3F, 2F, -0.5F, 2F, 0F); // wingRight1
		rightWingModel[0].setRotationPoint(-45F, -31F, 16F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 91, 5, 14, 0F, 1.5F, -0.5F, 0F, 0.5F, 4.5F, -2F, -9F, 0F, 0.5F, -6F, -3.5F, 0.5F, -0.5F, -1F, 0F, 0.5F, 0F, -2F, -9F, 4F, 0.5F, -8F, 1.5F, 0.5F); // wingRight2
		rightWingModel[1].setRotationPoint(-45F, -27F, 38F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 76, 4, 88, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, -61F, -29F, -2.5F, 12.5F, -30.5F, -2.5F, -2F, -1F, 0F, 0F, 1.5F, 0F, -61F, 27.5F, -3F, 11F, 28F, -2.5F); // wingRight3
		rightWingModel[2].setRotationPoint(-39F, -23.5F, 52.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 29, 9, 29, 0F, 0F, 0.5F, 0F, -4.5F, -7.5F, 0F, -30F, -17F, 0F, 21F, -10.5F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, -30F, 9F, 0F, 21F, 8.5F, 0F); // wingRight4
		rightWingModel[3].setRotationPoint(37F, -26.5F, 52.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 20, 8, 50, 0F, 0F, 0F, 0F, 0F, -6.45F, 0F, -43F, -21F, 0F, 35.35F, -19F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -43F, 14F, 0F, 35.7F, 14.15F, 0F); // wingFlap1
		rightWingModel[4].setRotationPoint(16F, -16F, 81.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F, -0.6F, -0.15F, 0F, -4.95F, -1.95F, 0F, -10.05F, -3.75F, 0F, 4.05F, -2.55F, 0.45F, -0.6F, -1.95F, 0F, -5.1F, -1.95F, 0F, -10.05F, 0F, 0F, 4.05F, 0F, 0F); // wingFlapTip1
		rightWingModel[5].setRotationPoint(-20F, 3F, 131.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 33, 12, 22, 0F, 0F, 0F, 0F, -1.05F, -9F, 0F, -20F, -15.25F, 0F, 10.8F, -7.2F, 0F, 0.7F, 0.75F, 0F, -1.05F, 0F, 0F, -20F, 5.15F, 0F, 10.8F, 4.65F, 0F); // wingRight5
		rightWingModel[6].setRotationPoint(56F, -38F, 20F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 32, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, -0.6F, 2.1F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 3.3F, 16F, -0.3F, 0.4F); // engineRight1
		rightWingModel[7].setRotationPoint(4F, -22F, 32F);
		rightWingModel[7].rotateAngleX = 0.27925268F;

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 32, 14, 3, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 20F, -4.9F, 1.1F, 16F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 23F, 0F, 1F, 16F, -2F, 0F); // engineRight2
		rightWingModel[8].setRotationPoint(4F, -12F, 35F);
		rightWingModel[8].rotateAngleX = 1.36135682F;

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 32, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, -2F, -0.7F, 16F, -0.1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 19.1F, 2F, 1F, 16F, 0F, 0F); // engineRight3
		rightWingModel[9].setRotationPoint(4F, -10F, 50F);
		rightWingModel[9].rotateAngleX = -3.85717765F;

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 21, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -3.8F, 0F, 0F, -2F, 30F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 1F, 30F, 0F, 1F); // engineRight4
		rightWingModel[10].setRotationPoint(34F, -33F, 41F);
		rightWingModel[10].rotateAngleX = -0.27925268F;

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 12, 8, 15, 0F, 0F, 0F, 0.4F, 0F, -2.1F, 0F, 0F, 0.4F, -6.2F, 0F, 0F, -3.8F, 0F, 0F, 2F, 0F, 2.7F, 1.1F, 0F, -1.7F, -0.7F, 0F, 0F, 1F); // engineRight5
		rightWingModel[11].setRotationPoint(55F, -33F, 41F);
		rightWingModel[11].rotateAngleX = -0.27925268F;

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 20, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3.5F); // engineRight6
		rightWingModel[12].setRotationPoint(67F, -23F, 37F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 20, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3.5F); // engineRight7
		rightWingModel[13].setRotationPoint(67F, -23F, 53F);
		rightWingModel[13].rotateAngleX = 3.14159265F;

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 12, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.1F, 1.2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -3.8F, 2F, -3.5F); // engineRight8
		rightWingModel[14].setRotationPoint(55F, -23F, 37F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight9
		rightWingModel[15].setRotationPoint(87F, -25F, 50F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight10
		rightWingModel[16].setRotationPoint(87F, -18F, 47F);
		rightWingModel[16].rotateAngleX = -1.57079633F;

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight11
		rightWingModel[17].setRotationPoint(87F, -21F, 50F);
		rightWingModel[17].rotateAngleX = -0.78539816F;

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight12
		rightWingModel[18].setRotationPoint(87F, -18F, 43F);
		rightWingModel[18].rotateAngleX = -2.35619449F;

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight13
		rightWingModel[19].setRotationPoint(87F, -21F, 40F);
		rightWingModel[19].rotateAngleX = -3.14159265F;

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight14
		rightWingModel[20].setRotationPoint(87F, -25F, 40F);
		rightWingModel[20].rotateAngleX = -3.92699082F;

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight15
		rightWingModel[21].setRotationPoint(87F, -28F, 43F);
		rightWingModel[21].rotateAngleX = -4.71238898F;

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, -2F, 0F, 0.5F, 0F); // engineRight16
		rightWingModel[22].setRotationPoint(87F, -28F, 47F);
		rightWingModel[22].rotateAngleX = -5.49778714F;

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // engineRight17
		rightWingModel[23].setRotationPoint(87F, -25F, 43F);


		bodyWheelModel = new ModelRendererTurbo[15];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 150
		bodyWheelModel[1] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 151
		bodyWheelModel[2] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 152
		bodyWheelModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 153
		bodyWheelModel[4] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 154
		bodyWheelModel[5] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 155
		bodyWheelModel[6] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 156
		bodyWheelModel[7] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 157
		bodyWheelModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 158
		bodyWheelModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 159
		bodyWheelModel[10] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 160
		bodyWheelModel[11] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 161
		bodyWheelModel[12] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 162
		bodyWheelModel[13] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 163
		bodyWheelModel[14] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 164

		bodyWheelModel[0].addBox(0F, 0F, 0F, 1, 33, 1, 0F); // Box 150
		bodyWheelModel[0].setRotationPoint(-36F, -26F, 0F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 151
		bodyWheelModel[1].setRotationPoint(-1F, -18F, 65F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 152
		bodyWheelModel[2].setRotationPoint(-37F, -26F, -1F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 153
		bodyWheelModel[3].setRotationPoint(-37F, 1F, -1F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 154
		bodyWheelModel[4].setRotationPoint(-39F, 3F, 2F);

		bodyWheelModel[5].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 155
		bodyWheelModel[5].setRotationPoint(-39F, 3F, -4F);

		bodyWheelModel[6].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 156
		bodyWheelModel[6].setRotationPoint(-4F, 3F, 67F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 157
		bodyWheelModel[7].setRotationPoint(-4F, 3F, 61F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 158
		bodyWheelModel[8].setRotationPoint(-2F, 1F, 64F);

		bodyWheelModel[9].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Box 159
		bodyWheelModel[9].setRotationPoint(-2F, -16F, 64F);

		bodyWheelModel[10].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 160
		bodyWheelModel[10].setRotationPoint(-1F, -18F, -66F);

		bodyWheelModel[11].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 161
		bodyWheelModel[11].setRotationPoint(-4F, 3F, -70F);

		bodyWheelModel[12].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 162
		bodyWheelModel[12].setRotationPoint(-4F, 3F, -64F);

		bodyWheelModel[13].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 163
		bodyWheelModel[13].setRotationPoint(-2F, 1F, -67F);

		bodyWheelModel[14].addBox(0F, 0F, 0F, 3, 9, 3, 0F); // Box 164
		bodyWheelModel[14].setRotationPoint(-2F, -16F, -67F);


		bodyDoorOpenModel = new ModelRendererTurbo[18];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 166, 182, textureX, textureY); // Box 130
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 181, 176, textureX, textureY); // Box 131
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 272, 175, textureX, textureY); // Box 132
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 243, 175, textureX, textureY); // Box 133
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 153, 170, textureX, textureY); // Box 134
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 155, 189, textureX, textureY); // Box 135
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 155, 189, textureX, textureY); // Box 136
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // openCanopy1
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 138
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 139
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 140
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 182, 176, textureX, textureY); // Box 141
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 153, 170, textureX, textureY); // Box 142
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 143
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 144
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 145
		bodyDoorOpenModel[16] = new ModelRendererTurbo(this, 182, 176, textureX, textureY); // Box 146
		bodyDoorOpenModel[17] = new ModelRendererTurbo(this, 166, 182, textureX, textureY); // Box 147

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 130
		bodyDoorOpenModel[0].setRotationPoint(-102F, -25F, 6F);
		bodyDoorOpenModel[0].rotateAngleX = 0.66322512F;
		bodyDoorOpenModel[0].rotateAngleZ = 0.54105207F;

		bodyDoorOpenModel[1].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 131
		bodyDoorOpenModel[1].setRotationPoint(-102F, -26F, -6F);
		bodyDoorOpenModel[1].rotateAngleZ = 0.62831853F;

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyDoorOpenModel[2].setRotationPoint(-101F, -27F, 0F);
		bodyDoorOpenModel[2].rotateAngleZ = 0.62831853F;

		bodyDoorOpenModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyDoorOpenModel[3].setRotationPoint(-101F, -27F, -6F);
		bodyDoorOpenModel[3].rotateAngleZ = 0.62831853F;

		bodyDoorOpenModel[4].addBox(0F, 0F, 0F, 33, 1, 1, 0F); // Box 134
		bodyDoorOpenModel[4].setRotationPoint(-106F, -24F, -7F);
		bodyDoorOpenModel[4].rotateAngleZ = 0.57595865F;

		bodyDoorOpenModel[5].addShapeBox(0F, 0F, 0F, 47, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 0F); // Box 135
		bodyDoorOpenModel[5].setRotationPoint(-102F, -25F, -9F);
		bodyDoorOpenModel[5].rotateAngleY = -0.06981317F;
		bodyDoorOpenModel[5].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[6].addShapeBox(0F, 0F, 0F, 47, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyDoorOpenModel[6].setRotationPoint(-102F, -25F, 8F);
		bodyDoorOpenModel[6].rotateAngleY = 0.06981317F;
		bodyDoorOpenModel[6].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 1F, 1.6F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 1F, 1.6F, -1F, 8F, 0.5F, 0F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 8F, 0.5F, 0F); // openCanopy1
		bodyDoorOpenModel[7].setRotationPoint(-101F, -25F, -8F);

		bodyDoorOpenModel[8].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 138
		bodyDoorOpenModel[8].setRotationPoint(-78F, -42F, 6F);
		bodyDoorOpenModel[8].rotateAngleX = 0.29670597F;

		bodyDoorOpenModel[9].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 139
		bodyDoorOpenModel[9].setRotationPoint(-78F, -42F, -7F);
		bodyDoorOpenModel[9].rotateAngleZ = 0.05235988F;

		bodyDoorOpenModel[10].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 140
		bodyDoorOpenModel[10].setRotationPoint(-78F, -42F, 6F);
		bodyDoorOpenModel[10].rotateAngleZ = 0.05235988F;

		bodyDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 141
		bodyDoorOpenModel[11].setRotationPoint(-60F, -43F, 8F);
		bodyDoorOpenModel[11].rotateAngleX = -1.1693706F;

		bodyDoorOpenModel[12].addBox(0F, 0F, 0F, 33, 1, 1, 0F); // Box 142
		bodyDoorOpenModel[12].setRotationPoint(-106F, -24F, 6F);
		bodyDoorOpenModel[12].rotateAngleZ = 0.57595865F;

		bodyDoorOpenModel[13].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 143
		bodyDoorOpenModel[13].setRotationPoint(-78F, -42F, -7F);
		bodyDoorOpenModel[13].rotateAngleX = -0.29670597F;

		bodyDoorOpenModel[14].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 144
		bodyDoorOpenModel[14].setRotationPoint(-78F, -42F, -7F);
		bodyDoorOpenModel[14].rotateAngleZ = 0.05235988F;

		bodyDoorOpenModel[15].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 145
		bodyDoorOpenModel[15].setRotationPoint(-60F, -43F, -7F);

		bodyDoorOpenModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 146
		bodyDoorOpenModel[16].setRotationPoint(-60F, -43F, -7F);
		bodyDoorOpenModel[16].rotateAngleX = -1.97222205F;

		bodyDoorOpenModel[17].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 147
		bodyDoorOpenModel[17].setRotationPoint(-102F, -26F, -7F);
		bodyDoorOpenModel[17].rotateAngleX = -0.66322512F;
		bodyDoorOpenModel[17].rotateAngleZ = 0.4712389F;


		bodyDoorCloseModel = new ModelRendererTurbo[18];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // canopy1
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 153, 170, textureX, textureY); // Box 113
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 153, 170, textureX, textureY); // Box 114
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 115
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 116
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 117
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 155, 189, textureX, textureY); // Box 118
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 155, 189, textureX, textureY); // Box 119
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 182, 176, textureX, textureY); // Box 120
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 182, 176, textureX, textureY); // Box 122
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 181, 176, textureX, textureY); // Box 122
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 166, 182, textureX, textureY); // Box 125
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 166, 182, textureX, textureY); // Box 126
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 127
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 128
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 202, 177, textureX, textureY); // Box 129
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 284, 184, textureX, textureY); // Box 151
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 254, 184, textureX, textureY); // Box 152

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 1F, 1.6F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 1F, 1.6F, -1F, 8F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 8F, 0.5F, 0F); // canopy1
		bodyDoorCloseModel[0].setRotationPoint(-59F, -33F, -8F);

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 33, 1, 1, 0F); // Box 113
		bodyDoorCloseModel[1].setRotationPoint(-64F, -32F, -7F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.57595865F;

		bodyDoorCloseModel[2].addBox(0F, 0F, 0F, 33, 1, 1, 0F); // Box 114
		bodyDoorCloseModel[2].setRotationPoint(-64F, -32F, 6F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.57595865F;

		bodyDoorCloseModel[3].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 115
		bodyDoorCloseModel[3].setRotationPoint(-18F, -51F, -7F);

		bodyDoorCloseModel[4].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 116
		bodyDoorCloseModel[4].setRotationPoint(-36F, -50F, -7F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.05235988F;

		bodyDoorCloseModel[5].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 117
		bodyDoorCloseModel[5].setRotationPoint(-36F, -50F, 6F);
		bodyDoorCloseModel[5].rotateAngleZ = 0.05235988F;

		bodyDoorCloseModel[6].addBox(0F, 0F, 0F, 47, 1, 1, 0F); // Box 118
		bodyDoorCloseModel[6].setRotationPoint(-60F, -33F, 8F);
		bodyDoorCloseModel[6].rotateAngleY = 0.06981317F;
		bodyDoorCloseModel[6].rotateAngleZ = 0.20943951F;

		bodyDoorCloseModel[7].addBox(0F, 0F, 0F, 47, 1, 1, 0F); // Box 119
		bodyDoorCloseModel[7].setRotationPoint(-60F, -33F, -9F);
		bodyDoorCloseModel[7].rotateAngleY = -0.06981317F;
		bodyDoorCloseModel[7].rotateAngleZ = 0.20943951F;

		bodyDoorCloseModel[8].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 120
		bodyDoorCloseModel[8].setRotationPoint(-18F, -51F, -7F);
		bodyDoorCloseModel[8].rotateAngleX = -1.97222205F;

		bodyDoorCloseModel[9].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 122
		bodyDoorCloseModel[9].setRotationPoint(-18F, -51F, 8F);
		bodyDoorCloseModel[9].rotateAngleX = -1.1693706F;

		bodyDoorCloseModel[10].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 122
		bodyDoorCloseModel[10].setRotationPoint(-60F, -34F, -6F);
		bodyDoorCloseModel[10].rotateAngleZ = 0.62831853F;

		bodyDoorCloseModel[11].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 125
		bodyDoorCloseModel[11].setRotationPoint(-60F, -33F, 6F);
		bodyDoorCloseModel[11].rotateAngleX = 0.66322512F;
		bodyDoorCloseModel[11].rotateAngleZ = 0.54105207F;

		bodyDoorCloseModel[12].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 126
		bodyDoorCloseModel[12].setRotationPoint(-60F, -34F, -7F);
		bodyDoorCloseModel[12].rotateAngleX = -0.66322512F;
		bodyDoorCloseModel[12].rotateAngleZ = 0.4712389F;

		bodyDoorCloseModel[13].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 127
		bodyDoorCloseModel[13].setRotationPoint(-36F, -50F, -7F);
		bodyDoorCloseModel[13].rotateAngleX = -0.29670597F;

		bodyDoorCloseModel[14].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 128
		bodyDoorCloseModel[14].setRotationPoint(-36F, -50F, 6F);
		bodyDoorCloseModel[14].rotateAngleX = 0.29670597F;

		bodyDoorCloseModel[15].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 129
		bodyDoorCloseModel[15].setRotationPoint(-36F, -50F, -7F);
		bodyDoorCloseModel[15].rotateAngleZ = 0.05235988F;

		bodyDoorCloseModel[16].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyDoorCloseModel[16].setRotationPoint(-59F, -35F, 0F);
		bodyDoorCloseModel[16].rotateAngleZ = 0.62831853F;

		bodyDoorCloseModel[17].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyDoorCloseModel[17].setRotationPoint(-59F, -35F, -6F);
		bodyDoorCloseModel[17].rotateAngleZ = 0.62831853F;



		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(91F, -23F, -45F);
		propellerModels[1] = makeProp2(91F, -23F, 45F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0.0F);
		prop[1].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0.0F);
		prop[2].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0.0F);
		prop[1].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0.0F);
		prop[2].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}