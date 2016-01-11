//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.swp;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZatBolt extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelZatBolt()
	{
		zatboltModel = new ModelRendererTurbo[1];
		zatboltModel[0] = new ModelRendererTurbo(this, 2, -26, textureX, textureY); // Import Box0

		zatboltModel[0].addBox(0F, 0F, 0F, 0, 28, 30, 0F); // Import Box0
		zatboltModel[0].setRotationPoint(0.5F, -13F, -15F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 1; i++)
		{
			zatboltModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo zatboltModel[];
}