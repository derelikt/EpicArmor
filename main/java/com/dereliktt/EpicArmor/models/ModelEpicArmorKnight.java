package com.dereliktt.EpicArmor.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEpicArmorKnight extends ModelBiped
{
  //fields
	public Boolean hasCloak = false;
	
    ModelRenderer head;
    ModelRenderer HelmForeHead;
    ModelRenderer LeftHelmForeHead;
    ModelRenderer RightHelmForeHead;
    ModelRenderer HelmNosePlate;
    ModelRenderer HelmRidgeCenter;
    ModelRenderer HelmRidgeCenter2;
    ModelRenderer HelmRidgeCenter3;
    ModelRenderer HelmRidgeCenter4;
    ModelRenderer HelmRidgeCenter5;
    ModelRenderer HelmRidgeCenter6;
    ModelRenderer HelmRidgeCenter7;
    ModelRenderer HelmRidgeCenter8;
    ModelRenderer HelmRidgeCenter9;
    ModelRenderer HelmRidgePlateBack;
    ModelRenderer HelmRidgePlateCenter;
    ModelRenderer HelmRidgePlateFront;
    ModelRenderer LeftHelmTop;
    ModelRenderer RightHelmTop;
    ModelRenderer HelmBackPlate;
    ModelRenderer LeftHelmForeheadPlate;
    ModelRenderer LeftHelmSidePlate;
    ModelRenderer RightHelmForeheadPlate;
    ModelRenderer RightHelmSidePlate;
    ModelRenderer body;
    ModelRenderer ChestPlate;
    ModelRenderer ChestPlate2;
    ModelRenderer ChestPlate3;
    ModelRenderer ChestPlate4;
    ModelRenderer Girdle;
    ModelRenderer Girdle2;
    ModelRenderer Girdle3;
    ModelRenderer BackPlate3;
    ModelRenderer LeftShoulderSpike;
    ModelRenderer rightarm;
    ModelRenderer RightShoulderBase;
    ModelRenderer RightShoulderTop;
    ModelRenderer RightShoulderPlate;
    ModelRenderer RightShoulderSpike;
    ModelRenderer LeftShoulderPlate;
    ModelRenderer leftarm;
    ModelRenderer LeftShoulderTop;
    ModelRenderer LeftShoulderBase;
    ModelRenderer RightShoulderBase2;
    ModelRenderer LeftShoulderBase2;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer LeftThighPlate;
    ModelRenderer LeftThighPlate2;
    ModelRenderer RightThighPlate;
    ModelRenderer RightThighPlate2;
    ModelRenderer RightThighPlate3;
    ModelRenderer LeftThighPlate3;
    ModelRenderer RightBoot;
    ModelRenderer LeftBoot;
    
  public ModelEpicArmorKnight(float expand)
  {
	  super(expand, 0.1f, 128, 64);
    
      head = new ModelRenderer(this, 96, 10);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = false;
      setRotation(head, 0F, 0F, 0F);
      
      HelmForeHead = new ModelRenderer(this, 82, 10);
      HelmForeHead.addBox(-0.5F, -8F, -5.033333F, 1, 3, 1, expand/3);
      HelmForeHead.setRotationPoint(0F, 0F, 0F);
      HelmForeHead.setTextureSize(128, 64);
      HelmForeHead.mirror = true;
      setRotation(HelmForeHead, 0F, 0F, 0F);
      
      LeftHelmForeHead = new ModelRenderer(this, 72, 10);
      LeftHelmForeHead.addBox(0F, -8F, -5F, 4, 3, 1, expand/3);
      LeftHelmForeHead.setRotationPoint(0F, 0F, 0F);
      LeftHelmForeHead.setTextureSize(128, 64);
      LeftHelmForeHead.mirror = true;
      setRotation(LeftHelmForeHead, 0F, -0.1047198F, 0F);
      
      RightHelmForeHead = new ModelRenderer(this, 72, 10);
      RightHelmForeHead.mirror = true;
      RightHelmForeHead.addBox(-4F, -8F, -5F, 4, 3, 1, expand/3);
      RightHelmForeHead.setRotationPoint(0F, 0F, 0F);
      RightHelmForeHead.setTextureSize(128, 64);
      
      setRotation(RightHelmForeHead, 0F, 0.1047198F, 0F);
      
      HelmNosePlate = new ModelRenderer(this, 86, 10);
      HelmNosePlate.addBox(-1F, -4.933333F, -5.3F, 2, 2, 1, expand/3);
      HelmNosePlate.setRotationPoint(0F, 0F, 0F);
      HelmNosePlate.setTextureSize(128, 64);
      HelmNosePlate.mirror = true;
      setRotation(HelmNosePlate, -0.0698132F, 0F, 0F);
      
      HelmRidgeCenter = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter.addBox(-0.501F, -12.5F, -1F, 1, 4, 2, expand/3);
      HelmRidgeCenter.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter.setTextureSize(128, 64);
      HelmRidgeCenter.mirror = true;
      setRotation(HelmRidgeCenter, 0F, 0F, 0F);
      
      HelmRidgeCenter2 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter2.addBox(-0.499F, -12.5F, -1F, 1, 4, 2, expand/3);
      HelmRidgeCenter2.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter2.setTextureSize(128, 64);
      HelmRidgeCenter2.mirror = true;
      setRotation(HelmRidgeCenter2, 0F, 0F, 0F);
      
      HelmRidgeCenter3 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter3.addBox(-0.501F, -12.5F, -1F, 1, 3, 2, expand/3);
      HelmRidgeCenter3.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter3.setTextureSize(128, 64);
      HelmRidgeCenter3.mirror = true;
      setRotation(HelmRidgeCenter3, 0.4712389F, 0F, 0F);
      
      HelmRidgeCenter4 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter4.addBox(-0.599F, -12.5F, -1F, 1, 3, 2, expand/3);
      HelmRidgeCenter4.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter4.setTextureSize(128, 64);
      HelmRidgeCenter4.mirror = true;
      setRotation(HelmRidgeCenter4, -0.4712389F, 0F, 0F);
      
      HelmRidgeCenter5 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter5.addBox(-0.501F, -12.5F, -1F, 1, 4, 2, expand/3);
      HelmRidgeCenter5.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter5.setTextureSize(128, 64);
      HelmRidgeCenter5.mirror = true;
      setRotation(HelmRidgeCenter5, 0.3141593F, 0F, 0F);
      
      HelmRidgeCenter6 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter6.addBox(-0.499F, -12.5F, -1F, 1, 4, 2, expand/3);
      HelmRidgeCenter6.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter6.setTextureSize(128, 64);
      HelmRidgeCenter6.mirror = true;
      setRotation(HelmRidgeCenter6, -0.3141593F, 0F, 0F);
      HelmRidgeCenter7 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter7.addBox(-0.501F, -12.5F, -1F, 1, 4, 2, expand/3);
      HelmRidgeCenter7.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter7.setTextureSize(128, 64);
      HelmRidgeCenter7.mirror = true;
      setRotation(HelmRidgeCenter7, 0.1570796F, 0F, 0F);
      HelmRidgeCenter8 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter8.addBox(-0.499F, -12.5F, -1F, 1, 4, 2, expand/3);
      HelmRidgeCenter8.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter8.setTextureSize(128, 64);
      HelmRidgeCenter8.mirror = true;
      setRotation(HelmRidgeCenter8, -0.1570796F, 0F, 0F);
      HelmRidgeCenter9 = new ModelRenderer(this, 32, 0);
      HelmRidgeCenter9.addBox(-0.501F, -12.5F, -1F, 1, 4, 2, expand/3);
      HelmRidgeCenter9.setRotationPoint(0F, 0F, 0F);
      HelmRidgeCenter9.setTextureSize(128, 64);
      HelmRidgeCenter9.mirror = true;
      setRotation(HelmRidgeCenter9, 0F, 0F, 0F);
      HelmRidgePlateBack = new ModelRenderer(this, 60, 12);
      HelmRidgePlateBack.addBox(-1F, -9.2F, 1F, 2, 1, 3, expand/3);
      HelmRidgePlateBack.setRotationPoint(0F, 0F, 0F);
      HelmRidgePlateBack.setTextureSize(128, 64);
      HelmRidgePlateBack.mirror = true;
      setRotation(HelmRidgePlateBack, -0.1570796F, 0F, 0F);
      HelmRidgePlateCenter = new ModelRenderer(this, 58, 10);
      HelmRidgePlateCenter.addBox(-1F, -8.9F, -2.4F, 2, 1, 5, expand/3);
      HelmRidgePlateCenter.setRotationPoint(0F, 0F, 0F);
      HelmRidgePlateCenter.setTextureSize(128, 64);
      HelmRidgePlateCenter.mirror = true;
      setRotation(HelmRidgePlateCenter, 0F, 0F, 0F);
      HelmRidgePlateFront = new ModelRenderer(this, 60, 12);
      HelmRidgePlateFront.addBox(-1F, -9.2F, -4F, 2, 1, 3, expand/3);
      HelmRidgePlateFront.setRotationPoint(0F, 0F, 0F);
      HelmRidgePlateFront.setTextureSize(128, 64);
      HelmRidgePlateFront.mirror = true;
      setRotation(HelmRidgePlateFront, 0.1570796F, 0F, 0F);
      LeftHelmTop = new ModelRenderer(this, 80, 0);
      LeftHelmTop.addBox(-0.5666667F, -8.5F, -4.502F, 4, 1, 9, expand/3);
      LeftHelmTop.setRotationPoint(0F, 0F, 0F);
      LeftHelmTop.setTextureSize(128, 64);
      LeftHelmTop.mirror = true;
      setRotation(LeftHelmTop, 0F, 0F, 0.122173F);
      //RightHelmTop.mirror = true;
      RightHelmTop = new ModelRenderer(this, 80, 0);
      RightHelmTop.addBox(-3.566667F, -8.5F, -4.502F, 4, 1, 9, expand/3);
      RightHelmTop.setRotationPoint(0F, 0F, 0F);
      RightHelmTop.setTextureSize(128, 64);
      RightHelmTop.mirror = true;
      setRotation(RightHelmTop, 0F, 0F, -0.1047198F);
      RightHelmTop.mirror = false;
      HelmBackPlate = new ModelRenderer(this, 60, 0);
      HelmBackPlate.addBox(-4.5F, -8F, 3.499F, 9, 8, 1, expand/3);
      HelmBackPlate.setRotationPoint(0F, 0F, 0F);
      HelmBackPlate.setTextureSize(128, 64);
      HelmBackPlate.mirror = true;
      setRotation(HelmBackPlate, 0F, 0F, 0F);
      LeftHelmForeheadPlate = new ModelRenderer(this, 52, 0);
      LeftHelmForeheadPlate.addBox(3.5F, -8F, -4.5F, 1, 3, 3, expand/3);
      LeftHelmForeheadPlate.setRotationPoint(0F, 0F, 0F);
      LeftHelmForeheadPlate.setTextureSize(128, 64);
      LeftHelmForeheadPlate.mirror = true;
      setRotation(LeftHelmForeheadPlate, 0F, 0F, 0F);
      LeftHelmSidePlate = new ModelRenderer(this, 38, 0);
      LeftHelmSidePlate.addBox(3.499F, -8F, -1.5F, 1, 8, 6, expand/3);
      LeftHelmSidePlate.setRotationPoint(0F, 0F, 0F);
      LeftHelmSidePlate.setTextureSize(128, 64);
      LeftHelmSidePlate.mirror = true;
      setRotation(LeftHelmSidePlate, 0F, 0F, 0F);
      //RightHelmForeheadPlate.mirror = true;
      RightHelmForeheadPlate = new ModelRenderer(this, 52, 0);
      RightHelmForeheadPlate.addBox(-4.5F, -8F, -4.5F, 1, 3, 3, expand/3);
      RightHelmForeheadPlate.setRotationPoint(0F, 0F, 0F);
      RightHelmForeheadPlate.setTextureSize(128, 64);
      RightHelmForeheadPlate.mirror = true;
      setRotation(RightHelmForeheadPlate, 0F, 0F, 0F);
      RightHelmForeheadPlate.mirror = false;
      //RightHelmSidePlate.mirror = true;
      RightHelmSidePlate = new ModelRenderer(this, 38, 0);
      RightHelmSidePlate.addBox(-4.499F, -8F, -1.5F, 1, 8, 6, expand/3);
      RightHelmSidePlate.setRotationPoint(0F, 0F, 0F);
      RightHelmSidePlate.setTextureSize(128, 64);
      RightHelmSidePlate.mirror = true;
      setRotation(RightHelmSidePlate, 0F, 0F, 0F);
      
      body = new ModelRenderer(this, 56, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4, expand/3);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      ChestPlate = new ModelRenderer(this, 20, 32);
      ChestPlate.addBox(-4.5F, 0.5F, -3F, 4, 4, 1, expand/3);
      ChestPlate.setRotationPoint(0F, 0F, 0F);
      ChestPlate.setTextureSize(128, 64);
      ChestPlate.mirror = true;
      setRotation(ChestPlate, -0.0698132F, 0F, 0F);
      ChestPlate.mirror = false;
      ChestPlate2 = new ModelRenderer(this, 20, 37);
      ChestPlate2.addBox(-4F, 1F, -2.7F, 8, 4, 1, expand/3);
      ChestPlate2.setRotationPoint(0F, 0F, 0F);
      ChestPlate2.setTextureSize(128, 64);
      ChestPlate2.mirror = true;
      setRotation(ChestPlate2, 0.0349066F, 0F, 0F);
      ChestPlate3 = new ModelRenderer(this, 20, 32);
      ChestPlate3.addBox(0.5F, 0.5F, -3F, 4, 4, 1, expand/3);
      ChestPlate3.setRotationPoint(0F, 0F, 0F);
      ChestPlate3.setTextureSize(128, 64);
      ChestPlate3.mirror = true;
      setRotation(ChestPlate3, -0.0698132F, 0F, 0F);
      ChestPlate4 = new ModelRenderer(this, 20, 42);
      ChestPlate4.addBox(-3.5F, 4.5F, -2.3F, 7, 2, 1, expand/3);
      ChestPlate4.setRotationPoint(0F, 0F, 0F);
      ChestPlate4.setTextureSize(128, 64);
      ChestPlate4.mirror = true;
      setRotation(ChestPlate4, 0F, 0F, 0F);
      Girdle = new ModelRenderer(this, 20, 57);
      Girdle.addBox(-4.5F, 9.5F, -2.5F, 9, 2, 5, expand/3);
      Girdle.setRotationPoint(0F, 0F, 0F);
      Girdle.setTextureSize(128, 64);
      Girdle.mirror = true;
      setRotation(Girdle, 0F, 0F, 0F);
      Girdle2 = new ModelRenderer(this, 20, 45);
      Girdle2.addBox(-4.2F, 9F, -2.3F, 3, 3, 5, expand/3);
      Girdle2.setRotationPoint(0F, 0F, 0F);
      Girdle2.setTextureSize(128, 64);
      Girdle2.mirror = true;
      setRotation(Girdle2, 0F, 0F, 0F);
      Girdle3 = new ModelRenderer(this, 20, 45);
      Girdle3.addBox(1.2F, 9F, -2.3F, 3, 3, 5, expand/3);
      Girdle3.setRotationPoint(0F, 0F, 0F);
      Girdle3.setTextureSize(128, 64);
      Girdle3.mirror = true;
      setRotation(Girdle3, 0F, 0F, 0F);
      BackPlate3 = new ModelRenderer(this, 48, 57);
      BackPlate3.addBox(-4F, 0F, 1.5F, 8, 4, 1, expand/3);
      BackPlate3.setRotationPoint(0F, 0F, 0F);
      BackPlate3.setTextureSize(128, 64);
      BackPlate3.mirror = true;
      setRotation(BackPlate3, 0F, 0F, 0F);
      
      LeftShoulderSpike = new ModelRenderer(this, 40, 33);
      LeftShoulderSpike.addBox(1F, -2.5F, -2.5F, 1, 1, 1, expand/3);
      LeftShoulderSpike.setRotationPoint(0F, 0F, 0F);
      LeftShoulderSpike.setTextureSize(128, 64);
      LeftShoulderSpike.mirror = true;
      setRotation(LeftShoulderSpike, -0.7853982F, 0F, 0F);
      
      rightarm = new ModelRenderer(this, 80, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4, expand/3);
      rightarm.setRotationPoint(0F, 0F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = false;
      setRotation(rightarm, 0F, 0F, 0F);

      RightShoulderBase = new ModelRenderer(this, 40, 47);
      RightShoulderBase.addBox(-3.5F, -2.5F, -2.5F, 5, 5, 5, expand/3);
      RightShoulderBase.setRotationPoint(0F, 0F, 0F);
      RightShoulderBase.setTextureSize(128, 64);
      RightShoulderBase.mirror = true;
      setRotation(RightShoulderBase, 0F, 0F, 0F);

      RightShoulderTop = new ModelRenderer(this, 44, 33);
      RightShoulderTop.addBox(-3F, -3F, -1.5F, 3, 1, 3, expand/3);
      RightShoulderTop.setRotationPoint(0F, 0F, 0F);
      RightShoulderTop.setTextureSize(128, 64);
      RightShoulderTop.mirror = true;
      setRotation(RightShoulderTop, 0F, 0F, 0F);

      RightShoulderPlate = new ModelRenderer(this, 44, 37);
      RightShoulderPlate.addBox(-4.1F, -1.4F, -3.5F, 1, 3, 7, expand/3);
      RightShoulderPlate.setRotationPoint(0F, 0F, 0F);
      RightShoulderPlate.setTextureSize(128, 64);
      RightShoulderPlate.mirror = true;
      setRotation(RightShoulderPlate, 0F, 0F, 0.2792527F);

      RightShoulderSpike = new ModelRenderer(this, 40, 33);
      RightShoulderSpike.addBox(-2F, -2.5F, -2.5F, 1, 1, 1, expand/3);
      RightShoulderSpike.setRotationPoint(0F, 0F, 0F);
      RightShoulderSpike.setTextureSize(128, 64);
      RightShoulderSpike.mirror = true;
      setRotation(RightShoulderSpike, -0.7853982F, 0F, 0F);
      
      LeftShoulderPlate = new ModelRenderer(this, 44, 37);
      LeftShoulderPlate.addBox(3.1F, -1.4F, -3.5F, 1, 3, 7, expand/3);
      LeftShoulderPlate.setRotationPoint(0F, 0F, 0F);
      LeftShoulderPlate.setTextureSize(128, 64);
      LeftShoulderPlate.mirror = true;
      setRotation(LeftShoulderPlate, 0F, 0F, -0.2792527F);
      
      leftarm = new ModelRenderer(this, 80, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4, expand/3);
      leftarm.setRotationPoint(0F, 0F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      
      setRotation(leftarm, 0F, 0F, 0F);
      LeftShoulderTop = new ModelRenderer(this, 44, 33);
      LeftShoulderTop.addBox(0F, -3F, -1.5F, 3, 1, 3, expand/3);
      LeftShoulderTop.setRotationPoint(0F, 0F, 0F);
      LeftShoulderTop.setTextureSize(128, 64);
      LeftShoulderTop.mirror = true;
      setRotation(LeftShoulderTop, 0F, 0F, 0F);
      LeftShoulderBase = new ModelRenderer(this, 40, 47);
      LeftShoulderBase.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, expand/3);
      LeftShoulderBase.setRotationPoint(0F, 0F, 0F);;
      LeftShoulderBase.setTextureSize(128, 64);
      LeftShoulderBase.mirror = true;
      setRotation(LeftShoulderBase, 0F, 0F, 0F);
      //RightShoulderBase2.mirror = true;
      RightShoulderBase2 = new ModelRenderer(this, 40, 47);
      RightShoulderBase2.addBox(-3.5F, -2.5F, -3F, 4, 4, 6, expand/3);
      RightShoulderBase2.setRotationPoint(0F, 0F, 0F);
      RightShoulderBase2.setTextureSize(128, 64);
      RightShoulderBase2.mirror = true;
      setRotation(RightShoulderBase2, 0F, 0F, 0F);
      RightShoulderBase2.mirror = false;
      LeftShoulderBase2 = new ModelRenderer(this, 40, 47);
      LeftShoulderBase2.addBox(-0.5F, -2.5F, -3F, 4, 4, 6, expand/3);
      LeftShoulderBase2.setRotationPoint(0F, 0F, 0F);
      LeftShoulderBase2.setTextureSize(128, 64);
      LeftShoulderBase2.mirror = true;
      setRotation(LeftShoulderBase2, 0F, 0F, 0F);
      
      
      LeftThighPlate = new ModelRenderer(this, 0, 38);
      LeftThighPlate.addBox(-1F, 3F, -2.3F, 2, 1, 1, expand/3);
      LeftThighPlate.setRotationPoint(0F, 0F, 0F);
      LeftThighPlate.setTextureSize(128, 64);
      LeftThighPlate.mirror = true;
      setRotation(LeftThighPlate, 0F, 0F, 0F);
      LeftThighPlate2 = new ModelRenderer(this, 0, 33);
      LeftThighPlate2.addBox(-1.5F, 0F, -2.5F, 3, 3, 1, expand/3);
      LeftThighPlate2.setRotationPoint(0F, 0F, 0F);
      LeftThighPlate2.setTextureSize(128, 64);
      LeftThighPlate2.mirror = true;
      setRotation(LeftThighPlate2, 0F, 0F, 0F);
      //RightThighPlate.mirror = true;
      RightThighPlate = new ModelRenderer(this, 0, 33);
      RightThighPlate.addBox(-1.5F, 0F, -2.5F, 3, 3, 1, expand/3);
      RightThighPlate.setRotationPoint(0F, 0F, 0F);
      RightThighPlate.setTextureSize(128, 64);
      RightThighPlate.mirror = true;
      setRotation(RightThighPlate, 0F, 0F, 0F);
      RightThighPlate.mirror = false;
      //RightThighPlate2.mirror = true;
      RightThighPlate2 = new ModelRenderer(this, 0, 38);
      RightThighPlate2.addBox(-1F, 3F, -2.3F, 2, 1, 1, expand/3);
      RightThighPlate2.setRotationPoint(0F, 0F, 0F);
      RightThighPlate2.setTextureSize(128, 64);
      RightThighPlate2.mirror = true;
      setRotation(RightThighPlate2, 0F, 0F, 0F);
      RightThighPlate2.mirror = false;
      //RightThighPlate3.mirror = true;
      RightThighPlate3 = new ModelRenderer(this, 0, 41);
      RightThighPlate3.addBox(-1F, 5.5F, -2.5F, 2, 2, 1, expand/3);
      RightThighPlate3.setRotationPoint(0F, 0F, 0F);
      RightThighPlate3.setTextureSize(128, 64);
      RightThighPlate3.mirror = true;
      setRotation(RightThighPlate3, 0F, 0F, 0F);
      RightThighPlate3.mirror = false;
      LeftThighPlate3 = new ModelRenderer(this, 0, 41);
      LeftThighPlate3.addBox(-1F, 5.5F, -2.5F, 2, 2, 1, expand/3);
      LeftThighPlate3.setRotationPoint(0F, 0F, 0F);
      LeftThighPlate3.setTextureSize(128, 64);
      LeftThighPlate3.mirror = true;
      setRotation(LeftThighPlate3, 0F, 0F, 0F);
      
      //leftleg.mirror = true;
      leftleg = new ModelRenderer(this, 100, 28);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4, expand/3);
      leftleg.setRotationPoint(0F, 0F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      leftleg.mirror = false;
      
      rightleg = new ModelRenderer(this, 100, 28);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4, expand/3);
      rightleg.setRotationPoint(0F, 0F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      
      RightBoot = new ModelRenderer(this, 80, 34);
      RightBoot.addBox(-2.5F, 8F, -2.5F, 5, 4, 5, expand/3);
      RightBoot.setRotationPoint(0F, 0F, 0F);
      RightBoot.setTextureSize(128, 64);
      RightBoot.mirror = true;
      setRotation(RightBoot, 0F, 0F, 0F);
      
      LeftBoot = new ModelRenderer(this, 80, 34);
      LeftBoot.addBox(-2.5F, 8F, -2.5F, 5, 4, 5, expand/3);
      LeftBoot.setRotationPoint(0F, 0F, 0F);
      LeftBoot.setTextureSize(128, 64);
      LeftBoot.mirror = true;
      setRotation(LeftBoot, 0F, 0F, 0F);
      
      this.bipedHead.addChild(head);
      this.bipedHead.addChild(HelmForeHead);
      this.bipedHead.addChild(LeftHelmForeHead);
      this.bipedHead.addChild(RightHelmForeHead);
      this.bipedHead.addChild(HelmNosePlate);
      this.bipedHead.addChild(HelmRidgeCenter);
      this.bipedHead.addChild(HelmRidgeCenter2);
      this.bipedHead.addChild(HelmRidgeCenter3);
      this.bipedHead.addChild(HelmRidgeCenter4);
      this.bipedHead.addChild(HelmRidgeCenter5);
      this.bipedHead.addChild(HelmRidgeCenter6);
      this.bipedHead.addChild(HelmRidgeCenter7);
      this.bipedHead.addChild(HelmRidgeCenter8);
      this.bipedHead.addChild(HelmRidgeCenter9);
      this.bipedHead.addChild(HelmRidgePlateBack);
      this.bipedHead.addChild(HelmRidgePlateCenter);
      this.bipedHead.addChild(HelmRidgePlateFront);
      this.bipedHead.addChild(LeftHelmTop);
      this.bipedHead.addChild(RightHelmTop);
      this.bipedHead.addChild(HelmBackPlate);
      this.bipedHead.addChild(LeftHelmForeheadPlate);
      this.bipedHead.addChild(LeftHelmSidePlate);
      this.bipedHead.addChild(RightHelmForeheadPlate);
      this.bipedHead.addChild(RightHelmSidePlate);
      body.addChild(ChestPlate);
      body.addChild(ChestPlate2);
      body.addChild(ChestPlate3);
      body.addChild(ChestPlate4);
      this.bipedBody.addChild(body);
      this.bipedBody.addChild(Girdle);
      this.bipedBody.addChild(Girdle2);
      this.bipedBody.addChild(Girdle3);
      this.bipedBody.addChild(BackPlate3);
      this.bipedLeftArm.addChild(leftarm);
      this.bipedLeftArm.addChild(LeftShoulderTop);
      this.bipedLeftArm.addChild(LeftShoulderBase);
      this.bipedLeftArm.addChild(LeftShoulderBase2);
      this.bipedLeftArm.addChild(LeftShoulderSpike);
      this.bipedLeftArm.addChild(LeftShoulderPlate);
      this.bipedRightArm.addChild(rightarm);
      this.bipedRightArm.addChild(RightShoulderBase);
      this.bipedRightArm.addChild(RightShoulderTop);
      this.bipedRightArm.addChild(RightShoulderPlate);
      this.bipedRightArm.addChild(RightShoulderSpike);
      this.bipedRightArm.addChild(RightShoulderBase2);
      
      
      
      this.bipedLeftLeg.addChild(leftleg);
      this.bipedLeftLeg.addChild(LeftThighPlate);
      this.bipedLeftLeg.addChild(LeftThighPlate2);
      this.bipedLeftLeg.addChild(LeftThighPlate3);
      this.bipedLeftLeg.addChild(LeftBoot);
      
      this.bipedRightLeg.addChild(rightleg);
      this.bipedRightLeg.addChild(RightThighPlate);
      this.bipedRightLeg.addChild(RightThighPlate2);
      this.bipedRightLeg.addChild(RightThighPlate3);
      this.bipedRightLeg.addChild(RightBoot);
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
   
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
 

}
