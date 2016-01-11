//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tok'Kal
// Model Creator:
// Created on:07.01.2016 - 20:24:46
// Last changed on: 07.01.2016 - 20:24:46

package com.flansmod.client.model.swp;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTokKal extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelTokKal()
	{
		tokkalModel = new ModelRendererTurbo[32];
		tokkalModel[0] = new ModelRendererTurbo(this, 27, 1, textureX, textureY); // Box 12
		tokkalModel[1] = new ModelRendererTurbo(this, 21, 1, textureX, textureY); // Box 13
		tokkalModel[2] = new ModelRendererTurbo(this, 2, 0, textureX, textureY); // Box 14
		tokkalModel[3] = new ModelRendererTurbo(this, 21, 0, textureX, textureY); // Box 15
		tokkalModel[4] = new ModelRendererTurbo(this, 21, 5, textureX, textureY); // Box 16
		tokkalModel[5] = new ModelRendererTurbo(this, 12, 7, textureX, textureY); // Box 17
		tokkalModel[6] = new ModelRendererTurbo(this, 21, 0, textureX, textureY); // Box 18
		tokkalModel[7] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Box 26
		tokkalModel[8] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 27
		tokkalModel[9] = new ModelRendererTurbo(this, 25, 12, textureX, textureY); // Box 28
		tokkalModel[10] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 29
		tokkalModel[11] = new ModelRendererTurbo(this, 15, 14, textureX, textureY); // Box 30
		tokkalModel[12] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 31
		tokkalModel[13] = new ModelRendererTurbo(this, -1, 21, textureX, textureY); // Box 32
		tokkalModel[14] = new ModelRendererTurbo(this, 23, 27, textureX, textureY); // Box 33
		tokkalModel[15] = new ModelRendererTurbo(this, 9, 23, textureX, textureY); // Box 34
		tokkalModel[16] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Box 35
		tokkalModel[17] = new ModelRendererTurbo(this, 9, 6, textureX, textureY); // Box 36
		tokkalModel[18] = new ModelRendererTurbo(this, 15, 14, textureX, textureY); // Box 37
		tokkalModel[19] = new ModelRendererTurbo(this, 18, 26, textureX, textureY); // Box 38
		tokkalModel[20] = new ModelRendererTurbo(this, 15, 14, textureX, textureY); // Box 39
		tokkalModel[21] = new ModelRendererTurbo(this, 4, 4, textureX, textureY); // Box 40
		tokkalModel[22] = new ModelRendererTurbo(this, 24, 8, textureX, textureY); // Box 41
		tokkalModel[23] = new ModelRendererTurbo(this, 5, 15, textureX, textureY); // Box 42
		tokkalModel[24] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 43
		tokkalModel[25] = new ModelRendererTurbo(this, 23, 15, textureX, textureY); // Box 44
		tokkalModel[26] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 45
		tokkalModel[27] = new ModelRendererTurbo(this, 11, 15, textureX, textureY); // Box 46
		tokkalModel[28] = new ModelRendererTurbo(this, 2, 7, textureX, textureY); // Box 47
		tokkalModel[29] = new ModelRendererTurbo(this, 28, 7, textureX, textureY); // Box 48
		tokkalModel[30] = new ModelRendererTurbo(this, 12, 26, textureX, textureY); // Box 49
		tokkalModel[31] = new ModelRendererTurbo(this, 9, 15, textureX, textureY); // Box 50

		tokkalModel[0].addBox(2F, -1F, -2F, 1, 2, 1, 0F); // Box 12
		tokkalModel[0].setRotationPoint(0F, 0F, 0F);

		tokkalModel[1].addBox(2F, -1F, 1F, 1, 2, 1, 0F); // Box 13
		tokkalModel[1].setRotationPoint(0F, 0F, 0F);

		tokkalModel[2].addBox(3F, -2F, 2F, 1, 4, 1, 0F); // Box 14
		tokkalModel[2].setRotationPoint(0F, 0F, 0F);

		tokkalModel[3].addBox(3F, 2F, -2F, 1, 1, 4, 0F); // Box 15
		tokkalModel[3].setRotationPoint(0F, 0F, 0F);

		tokkalModel[4].addBox(3F, -2F, -3F, 1, 4, 1, 0F); // Box 16
		tokkalModel[4].setRotationPoint(0F, 0F, 0F);

		tokkalModel[5].addBox(3F, -2F, -2F, 1, 4, 4, 0F); // Box 17
		tokkalModel[5].setRotationPoint(0F, 0F, 0F);

		tokkalModel[6].addBox(3F, -3F, -2F, 1, 1, 4, 0F); // Box 18
		tokkalModel[6].setRotationPoint(0F, 0F, 0F);

		tokkalModel[7].addBox(4F, -1F, 3F, 1, 2, 1, 0F); // Box 26
		tokkalModel[7].setRotationPoint(0F, 0F, 0F);

		tokkalModel[8].addBox(4F, -1F, -4F, 1, 2, 1, 0F); // Box 27
		tokkalModel[8].setRotationPoint(0F, 0F, 0F);

		tokkalModel[9].addBox(4F, -4F, -1F, 1, 1, 2, 0F); // Box 28
		tokkalModel[9].setRotationPoint(0F, 0F, 0F);

		tokkalModel[10].addBox(4F, 3F, -1F, 1, 1, 2, 0F); // Box 29
		tokkalModel[10].setRotationPoint(0F, 0F, 0F);

		tokkalModel[11].addBox(4F, -3F, -3F, 1, 6, 6, 0F); // Box 30
		tokkalModel[11].setRotationPoint(0F, 0F, 0F);

		tokkalModel[12].addBox(5F, -4F, -2F, 2, 1, 4, 0F); // Box 31
		tokkalModel[12].setRotationPoint(0F, 0F, 0F);

		tokkalModel[13].addBox(5F, 3F, -2F, 2, 1, 4, 0F); // Box 32
		tokkalModel[13].setRotationPoint(0F, 0F, 0F);

		tokkalModel[14].addBox(5F, -2F, 3F, 2, 2, 2, 0F); // Box 33
		tokkalModel[14].setRotationPoint(0F, 1F, 0F);

		tokkalModel[15].addBox(5F, -2F, 3F, 2, 1, 1, 0F); // Box 34
		tokkalModel[15].setRotationPoint(0F, 0F, 0F);

		tokkalModel[16].addBox(5F, 1F, 3F, 2, 1, 1, 0F); // Box 35
		tokkalModel[16].setRotationPoint(0F, 0F, 0F);

		tokkalModel[17].addBox(5F, -2F, -4F, 2, 4, 1, 0F); // Box 36
		tokkalModel[17].setRotationPoint(0F, 0F, 0F);

		tokkalModel[18].addBox(5F, -3F, -3F, 2, 6, 6, 0F); // Box 37
		tokkalModel[18].setRotationPoint(0F, 0F, 0F);

		tokkalModel[19].addBox(7F, -1F, 3F, 1, 2, 1, 0F); // Box 38
		tokkalModel[19].setRotationPoint(0F, 0F, 0F);

		tokkalModel[20].addBox(7F, -3F, -3F, 1, 6, 6, 0F); // Box 39
		tokkalModel[20].setRotationPoint(0F, 0F, 0F);

		tokkalModel[21].addBox(7F, -4F, -1F, 1, 1, 2, 0F); // Box 40
		tokkalModel[21].setRotationPoint(0F, 0F, 0F);

		tokkalModel[22].addBox(7F, 3F, -1F, 1, 1, 2, 0F); // Box 41
		tokkalModel[22].setRotationPoint(0F, 0F, 0F);

		tokkalModel[23].addBox(7F, -1F, -4F, 1, 2, 1, 0F); // Box 42
		tokkalModel[23].setRotationPoint(0F, 0F, 0F);

		tokkalModel[24].addBox(8F, -2F, 2F, 1, 4, 1, 0F); // Box 43
		tokkalModel[24].setRotationPoint(0F, 0F, 0F);

		tokkalModel[25].addBox(8F, -3F, -2F, 1, 1, 4, 0F); // Box 44
		tokkalModel[25].setRotationPoint(0F, 0F, 0F);

		tokkalModel[26].addBox(8F, -2F, -3F, 1, 4, 1, 0F); // Box 45
		tokkalModel[26].setRotationPoint(0F, 0F, 0F);

		tokkalModel[27].addBox(8F, 2F, -2F, 1, 1, 4, 0F); // Box 46
		tokkalModel[27].setRotationPoint(0F, 0F, 0F);

		tokkalModel[28].addBox(8F, -2F, -2F, 1, 4, 4, 0F); // Box 47
		tokkalModel[28].setRotationPoint(0F, 0F, 0F);

		tokkalModel[29].addBox(9F, -1F, -2F, 1, 2, 1, 0F); // Box 48
		tokkalModel[29].setRotationPoint(0F, 0F, 0F);

		tokkalModel[30].addBox(9F, -2F, -1F, 1, 4, 2, 0F); // Box 49
		tokkalModel[30].setRotationPoint(0F, 0F, 0F);

		tokkalModel[31].addBox(9F, -1F, 1F, 1, 2, 1, 0F); // Box 50
		tokkalModel[31].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 32; i++)
		{
			tokkalModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo tokkalModel[];
}