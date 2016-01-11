//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSerpentGuardBody extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelSerpentGuardBody() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // neckGuard
		bodyModel[1] = new ModelRendererTurbo(this, 48, 1, textureX, textureY); // sholderRight
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // bibPlate
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // pouchGuard
		bodyModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // bodyChainMail
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // belt
		bodyModel[6] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // beltBuckle
		bodyModel[7] = new ModelRendererTurbo(this, 48, 1, textureX, textureY); // sholderLeft

		bodyModel[0].addBox(-5F, -1F, -4F, 10, 3, 8, 0F); // neckGuard
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-9F, -1F, -3F, 4, 2, 6, 0F); // sholderRight
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-6F, 1F, -3.5F, 12, 3, 7, 0F); // bibPlate
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-2F, 4F, -3F, 4, 5, 6, 0F); // pouchGuard
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(-4.5F, 4F, -2.5F, 9, 5, 5, 0F); // bodyChainMail
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-4F, 9F, -3F, 8, 2, 6, 0F); // belt
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-2F, 9F, -3.5F, 4, 2, 7, 0F); // beltBuckle
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(5F, -1F, -3F, 4, 2, 6, 0F); // sholderLeft
		bodyModel[7].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[3];
		leftArmModel[0] = new ModelRendererTurbo(this, 24, 33, textureX, textureY); // vambrace
		leftArmModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // vambraceHandRight
		leftArmModel[2] = new ModelRendererTurbo(this, 56, 25, textureX, textureY); // leftArm

		leftArmModel[0].addBox(-1F, 5F, -3F, 5, 2, 6, 0F); // vambrace
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addBox(3.5F, 6F, -1F, 1, 2, 2, 0F); // vambraceHandRight
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addBox(-1F, -2F, -2.5F, 4, 7, 5, 0F); // leftArm
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // vambraceHandLeft
		rightArmModel[1] = new ModelRendererTurbo(this, 32, 25, textureX, textureY); // vambrace
		rightArmModel[2] = new ModelRendererTurbo(this, 56, 25, textureX, textureY); // rightArm

		rightArmModel[0].addBox(-4.5F, 6F, -1F, 1, 2, 2, 0F); // vambraceHandLeft
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addBox(-4F, 5F, -3F, 5, 2, 6, 0F); // vambrace
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addBox(-3F, -2F, -2.5F, 4, 7, 5, 0F); // rightArm
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


		skirtFrontModel = new ModelRendererTurbo[2];
		skirtFrontModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // ChainFront
		skirtFrontModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // skirtFront

		skirtFrontModel[0].addBox(-2F, -1F, -3F, 4, 5, 1, 0F); // ChainFront
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addBox(-4.5F, -1F, -2.5F, 9, 5, 2, 0F); // skirtFront
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);


		skirtRearModel = new ModelRendererTurbo[1];
		skirtRearModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // SkirtRear

		skirtRearModel[0].addBox(-4.5F, -1F, 0.5F, 9, 5, 2, 0F); // SkirtRear
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);


	}
}