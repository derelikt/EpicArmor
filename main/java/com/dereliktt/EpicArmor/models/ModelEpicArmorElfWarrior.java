package com.dereliktt.EpicArmor.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEpicArmorElfWarrior extends ModelBiped
{
  //fields
	public Boolean hasCloak = false;
    ModelRenderer Hat1;
    ModelRenderer Hat2;
    ModelRenderer Hat3;
    ModelRenderer Hat4;
    ModelRenderer Hat5;
    ModelRenderer Hat6;
    ModelRenderer Hat7;
    ModelRenderer Hat8;
    ModelRenderer Hat9;
    ModelRenderer Hat10;
    ModelRenderer Hat11;
    ModelRenderer Hat12;
    ModelRenderer Hat13;
    ModelRenderer Hat14;
    ModelRenderer Hat15;
    ModelRenderer body;
    ModelRenderer scabberd;
    ModelRenderer skirtback;
    ModelRenderer skirtfront;
    ModelRenderer skirtleft;
    ModelRenderer skirtright;
    ModelRenderer rightarm;
    ModelRenderer rightglove;
    ModelRenderer leftarm;
    ModelRenderer leftglove;
    ModelRenderer rightleg;
    ModelRenderer rightboottop;
    ModelRenderer rightboot;
    ModelRenderer leftleg;
    ModelRenderer leftboottop;
    ModelRenderer leftboot;
  
  public ModelEpicArmorElfWarrior(float expand)
  {
	  super(expand, 0.1f, 128, 64);
	  textureWidth = 128;
	  textureHeight = 128;
      
      
      Hat1 = new ModelRenderer(this, 64, 90);
      Hat1.addBox(-4.5F, -7F, -7F, 9, 2, 9, expand/3);
      Hat1.setRotationPoint(0F, 0F, 0F);
      Hat1.setTextureSize(64, 32);
      Hat1.mirror = true;
      setRotation(Hat1, -0.6457718F, 0F, 0F);
      Hat2 = new ModelRenderer(this, 64, 90);
      Hat2.addBox(-4.501F, -7F, -8.6F, 9, 2, 9, expand/3);
      Hat2.setRotationPoint(0F, 0F, 0F);
      Hat2.setTextureSize(64, 32);
      Hat2.mirror = true;
      setRotation(Hat2, -0.9075712F, 0F, 0F);
      Hat3 = new ModelRenderer(this, 64, 90);
      Hat3.addBox(-4.501F, -7F, -9.9F, 9, 2, 9, expand/3);
      Hat3.setRotationPoint(0F, 0F, 0F);
      Hat3.setTextureSize(64, 32);
      Hat3.mirror = true;
      setRotation(Hat3, -1.117011F, 0F, 0F);
      Hat4 = new ModelRenderer(this, 64, 90);
      Hat4.addBox(-4.501F, -7F, -11F, 9, 2, 9, expand/3);
      Hat4.setRotationPoint(0F, 0F, 0F);
      Hat4.setTextureSize(64, 32);
      Hat4.mirror = true;
      setRotation(Hat4, -1.308997F, 0F, 0F);
      Hat5 = new ModelRenderer(this, 64, 90);
      Hat5.addBox(-4F, -7F, -11.5F, 8, 2, 7, expand/3);
      Hat5.setRotationPoint(0F, 0F, 0F);
      Hat5.setTextureSize(64, 32);
      Hat5.mirror = true;
      setRotation(Hat5, -1.48353F, 0F, 0F);
      Hat6 = new ModelRenderer(this, 64, 90);
      Hat6.addBox(-4F, -4.9F, -13.1F, 8, 2, 8, expand/3);
      Hat6.setRotationPoint(0F, 0F, 0F);
      Hat6.setTextureSize(64, 32);
      Hat6.mirror = true;
      setRotation(Hat6, -1.815142F, 0F, 0F);
      Hat7 = new ModelRenderer(this, 64, 90);
      Hat7.addBox(-4F, -3.9F, -13.8F, 8, 2, 8, expand/3);
      Hat7.setRotationPoint(0F, 0F, 0F);
      Hat7.setTextureSize(64, 32);
      Hat7.mirror = true;
      setRotation(Hat7, -2.024582F, 0F, 0F);
      Hat8 = new ModelRenderer(this, 64, 90);
      Hat8.addBox(-3.5F, -2F, -14.3F, 7, 2, 7, expand/3);
      Hat8.setRotationPoint(0F, 0F, 0F);
      Hat8.setTextureSize(64, 32);
      Hat8.mirror = true;
      setRotation(Hat8, -2.303835F, 0F, 0F);
      Hat9 = new ModelRenderer(this, 64, 90);
      Hat9.addBox(-3.5F, 1F, -14.1F, 7, 2, 7, expand/3);
      Hat9.setRotationPoint(0F, 0F, 0F);
      Hat9.setTextureSize(64, 32);
      Hat9.mirror = true;
      setRotation(Hat9, -2.6529F, 0F, 0F);
      Hat10 = new ModelRenderer(this, 64, 90);
      Hat10.addBox(-3F, 1F, -13.5F, 6, 2, 6, expand/3);
      Hat10.setRotationPoint(0F, 0F, 0F);
      Hat10.setTextureSize(64, 32);
      Hat10.mirror = true;
      setRotation(Hat10, -2.792527F, 0F, 0F);
      Hat11 = new ModelRenderer(this, 64, 90);
      Hat11.addBox(-3F, 1F, -13.2F, 6, 2, 6, expand/3);
      Hat11.setRotationPoint(0F, 0F, 0F);
      Hat11.setTextureSize(64, 32);
      Hat11.mirror = true;
      setRotation(Hat11, -2.932153F, 0F, 0F);
      Hat12 = new ModelRenderer(this, 64, 90);
      Hat12.addBox(-2.5F, 1.7F, -12.2F, 5, 2, 5, expand/3);
      Hat12.setRotationPoint(0F, 0F, 0F);
      Hat12.setTextureSize(64, 32);
      Hat12.mirror = true;
      setRotation(Hat12, -3.14392F, 0F, 0F);
      Hat13 = new ModelRenderer(this, 64, 90);
      Hat13.addBox(-2F, 0.7F, -12F, 4, 1, 4, expand/3);
      Hat13.setRotationPoint(0F, 0F, 0F);
      Hat13.setTextureSize(64, 32);
      Hat13.mirror = true;
      setRotation(Hat13, -3.14392F, 0F, 0F);
      Hat14 = new ModelRenderer(this, 64, 90);
      Hat14.addBox(-1.5F, -0.3F, -11.8F, 3, 1, 3, expand/3);
      Hat14.setRotationPoint(0F, 0F, 0F);
      Hat14.setTextureSize(64, 32);
      Hat14.mirror = true;
      setRotation(Hat14, -3.14392F, 0F, 0F);
      Hat15 = new ModelRenderer(this, 64, 90);
      Hat15.addBox(-1F, -1.3F, -11.6F, 2, 1, 2, expand/3);
      Hat15.setRotationPoint(0F, 0F, 0F);
      Hat15.setTextureSize(64, 32);
      Hat15.mirror = true;
      setRotation(Hat15, -3.14392F, 0F, 0F);
      body = new ModelRenderer(this, 80, 106);
      body.addBox(-4F, 0F, -2F, 8, 12, 4, expand/3);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      scabberd = new ModelRenderer(this, 0, 90);
      scabberd.addBox(0F, 0F, 0F, 3, 13, 1, expand/3);
      scabberd.setRotationPoint(3F, -1F, 2F);
      scabberd.setTextureSize(128, 128);
      scabberd.mirror = true;
      setRotation(scabberd, 0F, 0F, 0.5410521F);
      skirtback = new ModelRenderer(this, 31, 90);
      skirtback.addBox(0F, 0F, 0F, 9, 5, 1, expand/3);
      skirtback.setRotationPoint(-4.5F, 11.1F, 1.5F);
      skirtback.setTextureSize(128, 128);
      skirtback.mirror = true;
      setRotation(skirtback, 0.1047198F, 0F, 0F);
      skirtfront = new ModelRenderer(this, 31, 90);
      skirtfront.addBox(0F, 0F, 0F, 9, 5, 1, expand/3);
      skirtfront.setRotationPoint(-4.5F, 11F, -2.5F);
      skirtfront.setTextureSize(128, 128);
      skirtfront.mirror = true;
      setRotation(skirtfront, -0.1047198F, 0F, 0F);
      skirtleft = new ModelRenderer(this, 39, 96);
      skirtleft.addBox(0F, 0F, 0F, 1, 5, 5, expand/3);
      skirtleft.setRotationPoint(3.6F, 11.1F, -2.5F);
      skirtleft.setTextureSize(128, 128);
      skirtleft.mirror = true;
      setRotation(skirtleft, 0F, 0F, -0.122173F);
      skirtright = new ModelRenderer(this, 39, 96);
      skirtright.addBox(0F, 0F, 0F, 1, 5, 5, expand/3);
      skirtright.setRotationPoint(-4.5F, 11F, -2.5F);
      skirtright.setTextureSize(128, 128);
      skirtright.mirror = true;
      setRotation(skirtright, 0F, 0F, 0.1396263F);
      rightarm = new ModelRenderer(this, 104, 106);
      rightarm.addBox(-3F, -2F, -2F, 4, 8, 4, expand/3);
      rightarm.setRotationPoint(0F, 0F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      rightglove = new ModelRenderer(this, 0, 106);
      rightglove.addBox(0F, 0F, 0F, 5, 4, 5, expand/3);
      rightglove.setRotationPoint(-3.5F, 6.5F, -2.5F);
      rightglove.setTextureSize(128, 128);
      rightglove.mirror = true;
      setRotation(rightglove, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 104, 106);
      leftarm.addBox(-1F, -2F, -2F, 4, 8, 4, expand/3);
      leftarm.setRotationPoint(0F, 0F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      leftglove = new ModelRenderer(this, 20, 106);
      leftglove.addBox(0F, 0F, 0F, 5, 4, 5, expand/3);
      leftglove.setRotationPoint(-1.5F, 6.5F, -2.5F);
      leftglove.setTextureSize(128, 128);
      leftglove.mirror = true;
      setRotation(leftglove, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 64, 106);
      rightleg.addBox(-2F, 0F, -2F, 4, 8, 4, expand/3);
      rightleg.setRotationPoint(0F, 0F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      rightboottop = new ModelRenderer(this, 41, 113);
      rightboottop.addBox(0F, 0F, 0F, 5, 1, 5, expand/3);
      rightboottop.setRotationPoint(-2.5F, 8F, -2.5F);
      rightboottop.setTextureSize(128, 128);
      rightboottop.mirror = true;
      setRotation(rightboottop, 0F, 0F, 0F);
      rightboot = new ModelRenderer(this, 41, 119);
      rightboot.addBox(0F, 0F, 0F, 4, 4, 4, expand/3);
      rightboot.setRotationPoint(-2F, 8F, -2F);
      rightboot.setTextureSize(128, 128);
      rightboot.mirror = true;
      setRotation(rightboot, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 64, 106);
      leftleg.addBox(-2F, 0F, -2F, 4, 8, 4, expand/3);
      leftleg.setRotationPoint(0F, 0F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      leftboottop = new ModelRenderer(this, 41, 113);
      leftboottop.addBox(0F, 0F, 0F, 5, 1, 5, expand/3);
      leftboottop.setRotationPoint(-2.5F, 8F, -2.5F);
      leftboottop.setTextureSize(128, 128);
      leftboottop.mirror = true;
      setRotation(leftboottop, 0F, 0F, 0F);
      leftboot = new ModelRenderer(this, 41, 119);
      leftboot.addBox(0F, 0F, 0F, 4, 4, 4, expand/3);
      leftboot.setRotationPoint(-2.0F, 8F, -2F);
      leftboot.setTextureSize(128, 128);
      leftboot.mirror = true;
      setRotation(leftboot, 0F, 0F, 0F);
      
      this.bipedHead.addChild(Hat1);
      this.bipedHead.addChild(Hat2);
      this.bipedHead.addChild(Hat3);
      this.bipedHead.addChild(Hat4);
      this.bipedHead.addChild(Hat5);
      this.bipedHead.addChild(Hat6);
      this.bipedHead.addChild(Hat7);
      this.bipedHead.addChild(Hat8);
      this.bipedHead.addChild(Hat9);
      this.bipedHead.addChild(Hat10);
      this.bipedHead.addChild(Hat11);
      this.bipedHead.addChild(Hat12);
      this.bipedHead.addChild(Hat13);
      this.bipedHead.addChild(Hat14);
      this.bipedHead.addChild(Hat15);
      
      
      this.bipedBody.addChild(body);
      this.bipedBody.addChild(scabberd);
      this.bipedBody.addChild(skirtfront);
      this.bipedBody.addChild(skirtback);
      this.bipedBody.addChild(skirtleft);
      this.bipedBody.addChild(skirtright);
      
      this.bipedRightArm.addChild(rightarm);
      this.bipedRightArm.addChild(rightglove);
      
      this.bipedLeftArm.addChild(leftarm);
      this.bipedLeftArm.addChild(leftglove);
      
      this.bipedRightLeg.addChild(rightleg);
      this.bipedRightLeg.addChild(rightboottop);
      this.bipedRightLeg.addChild(rightboot);
      
      this.bipedLeftLeg.addChild(leftleg);
      this.bipedLeftLeg.addChild(leftboottop);
      this.bipedLeftLeg.addChild(leftboot);
      
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
