//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: StaffBullet
// Model Creator:
// Created on:22.12.2015 - 13:47:29
// Last changed on: 22.12.2015 - 13:47:29

package com.flansmod.client.model.swp;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStaffBullet extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelStaffBullet()
	{
		staffbulletModel = new ModelRendererTurbo[5];
		staffbulletModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box1
		staffbulletModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box2
		staffbulletModel[2] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box4
		staffbulletModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box5
		staffbulletModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box3

		staffbulletModel[0].addBox(0.5F, 0.5F, 1F, 1, 1, 1, 0F); // Box1
		staffbulletModel[0].setRotationPoint(0F, 0F, 0F);
		staffbulletModel[0].rotateAngleX = 1.57079633F;

		staffbulletModel[1].addBox(-0.5F, 0F, -3F, 3, 2, 3, 0F); // Box2
		staffbulletModel[1].setRotationPoint(0F, 0F, 0F);
		staffbulletModel[1].rotateAngleX = 1.57079633F;

		staffbulletModel[2].addBox(0.5F, 0.5F, -5F, 1, 1, 1, 0F); // Box4
		staffbulletModel[2].setRotationPoint(0F, 0F, 0F);
		staffbulletModel[2].rotateAngleX = 1.57079633F;

		staffbulletModel[3].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box5
		staffbulletModel[3].setRotationPoint(0F, 0F, 0F);
		staffbulletModel[3].rotateAngleX = 1.57079633F;

		staffbulletModel[4].addBox(0F, 0F, -4F, 2, 2, 1, 0F); // Box3
		staffbulletModel[4].setRotationPoint(0F, 0F, 0F);
		staffbulletModel[4].rotateAngleX = 1.57079633F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 5; i++)
		{
			staffbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo staffbulletModel[];
}