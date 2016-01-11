package com.flansmod.client.model.swp;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZatNikTel extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelZatNikTel() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[3];
		gunModel[0] = new ModelRendererTurbo(this, 1, 8, textureX, textureY); // Import body01
		gunModel[1] = new ModelRendererTurbo(this, 8, 5, textureX, textureY); // Import body02
		gunModel[2] = new ModelRendererTurbo(this, 5, 2, textureX, textureY); // Import body03

		gunModel[0].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Import body01
		gunModel[0].setRotationPoint(-2F, -6F, -1F);
		gunModel[0].rotateAngleZ = -0.64577182F;

		gunModel[1].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Import body02
		gunModel[1].setRotationPoint(-2F, -7F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import body03
		gunModel[2].setRotationPoint(1.25F, -7F, -0.5F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Import fangs01

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import fangs01
		defaultBarrelModel[0].setRotationPoint(2F, -7F, 0F);
		defaultBarrelModel[0].rotateAngleY = -0.78539816F;


		defaultStockModel = new ModelRendererTurbo[1];
		defaultStockModel[0] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Import gem01

		defaultStockModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Import gem01
		defaultStockModel[0].setRotationPoint(-2F, 3F, -1F);


		defaultGripModel = new ModelRendererTurbo[1];
		defaultGripModel[0] = new ModelRendererTurbo(this, 2, 11, textureX, textureY); // Import grip01

		defaultGripModel[0].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Import grip01
		defaultGripModel[0].setRotationPoint(2F, -3F, -1F);
		defaultGripModel[0].rotateAngleZ = -0.34906585F;


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Import powercell01
		ammoModel[1] = new ModelRendererTurbo(this, 5, 0, textureX, textureY); // Import powercell02
		ammoModel[2] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Import powercell03
		ammoModel[3] = new ModelRendererTurbo(this, 15, 0, textureX, textureY); // Import powercell04

		ammoModel[0].addBox(0F, 0F, -0.5F, 2, 1, 1, 0F); // Import powercell01
		ammoModel[0].setRotationPoint(2F, -8F, 0F);
		ammoModel[0].rotateAngleZ = -0.50614548F;

		ammoModel[1].addBox(0F, 0F, -0.5F, 2, 1, 1, 0F); // Import powercell02
		ammoModel[1].setRotationPoint(1.5F, -8F, 0F);
		ammoModel[1].rotateAngleZ = -0.50614548F;

		ammoModel[2].addBox(0F, 0F, -0.5F, 2, 1, 1, 0F); // Import powercell03
		ammoModel[2].setRotationPoint(1F, -8F, 0F);
		ammoModel[2].rotateAngleZ = -0.50614548F;

		ammoModel[3].addBox(0F, 0F, -0.5F, 3, 1, 1, 0F); // Import powercell04
		ammoModel[3].setRotationPoint(-1F, -7.5F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.558F;
		untiltGunTime = 0.163F;
	}
}
