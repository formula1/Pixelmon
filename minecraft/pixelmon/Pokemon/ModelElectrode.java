// Date: 7/31/2012 1:17:31 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.Pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;


public class ModelElectrode extends ModelBase
{
  //fields
    ModelRenderer Piece1;
    ModelRenderer Main;
    ModelRenderer Bottomside1;
    ModelRenderer Rightside1;
    ModelRenderer Leftside1;
    ModelRenderer Topside1;
    ModelRenderer Backside1;
    ModelRenderer Frontside1;
    ModelRenderer Frontside2;
    ModelRenderer Backside2;
    ModelRenderer Topside2;
    ModelRenderer Leftside2;
    ModelRenderer Rightside2;
    ModelRenderer Bottomside2;
    ModelRenderer Right_eye;
    ModelRenderer Left_eye;
    ModelRenderer Left_top_brow;
    ModelRenderer Right_top_brow;
  
  public ModelElectrode()
  {
    textureWidth = 128;
    textureHeight = 64;
    setTextureOffset("Piece1.Folder1", 0, 0);
    
    Piece1 = new ModelRenderer(this, "Piece1");
    Piece1.setRotationPoint(0F, 17F, 0F);
    setRotation(Piece1, 0F, 0F, 0F);
    Piece1.mirror = true;
      Main = new ModelRenderer(this, 0, 0);
      Main.addBox(-6F, -6F, -6F, 12, 12, 12);
      Main.setRotationPoint(0F, 0F, 0F);
      Main.setTextureSize(128, 64);
      Main.mirror = true;
      setRotation(Main, 0F, 0F, 0F);
      Bottomside1 = new ModelRenderer(this, 33, 36);
      Bottomside1.addBox(-5F, 4.5F, -5F, 10, 2, 10);
      Bottomside1.setRotationPoint(0F, 0F, 0F);
      Bottomside1.setTextureSize(128, 64);
      Bottomside1.mirror = true;
      setRotation(Bottomside1, 0F, 0F, 0F);
      Rightside1 = new ModelRenderer(this, 70, 0);
      Rightside1.addBox(-6.5F, -5F, -5F, 1, 10, 10);
      Rightside1.setRotationPoint(0F, 0F, 0F);
      Rightside1.setTextureSize(128, 64);
      Rightside1.mirror = true;
      setRotation(Rightside1, 0F, 0F, 0F);
      Leftside1 = new ModelRenderer(this, 70, 0);
      Leftside1.addBox(5.5F, -5F, -5F, 1, 10, 10);
      Leftside1.setRotationPoint(0F, 0F, 0F);
      Leftside1.setTextureSize(128, 64);
      Leftside1.mirror = true;
      setRotation(Leftside1, 0F, 0F, 0F);
      Topside1 = new ModelRenderer(this, 33, 36);
      Topside1.addBox(-5F, -6.5F, -5F, 10, 2, 10);
      Topside1.setRotationPoint(0F, 0F, 0F);
      Topside1.setTextureSize(128, 64);
      Topside1.mirror = true;
      setRotation(Topside1, 0F, 0F, 0F);
      Backside1 = new ModelRenderer(this, 0, 35);
      Backside1.addBox(-5F, -5F, 4.5F, 10, 10, 2);
      Backside1.setRotationPoint(0F, 0F, 0F);
      Backside1.setTextureSize(128, 64);
      Backside1.mirror = true;
      setRotation(Backside1, 0F, 0F, 0F);
      Frontside1 = new ModelRenderer(this, -1, 35);
      Frontside1.addBox(-5F, -5F, -6.5F, 10, 10, 2);
      Frontside1.setRotationPoint(0F, 0F, 0F);
      Frontside1.setTextureSize(128, 64);
      Frontside1.mirror = true;
      setRotation(Frontside1, 0F, 0F, 0F);
      Frontside2 = new ModelRenderer(this, -1, 25);
      Frontside2.addBox(-4F, -4F, -7F, 8, 8, 2);
      Frontside2.setRotationPoint(0F, 0F, 0F);
      Frontside2.setTextureSize(128, 64);
      Frontside2.mirror = true;
      setRotation(Frontside2, 0F, 0F, 0F);
      Backside2 = new ModelRenderer(this, 0, 25);
      Backside2.addBox(-4F, -4F, 5F, 8, 8, 2);
      Backside2.setRotationPoint(0F, 0F, 0F);
      Backside2.setTextureSize(128, 64);
      Backside2.mirror = true;
      setRotation(Backside2, 0F, 0F, 0F);
      Leftside2 = new ModelRenderer(this, 51, 0);
      Leftside2.addBox(6F, -4F, -4F, 1, 8, 8);
      Leftside2.setRotationPoint(0F, 0F, 0F);
      Leftside2.setTextureSize(128, 64);
      Leftside2.mirror = true;
      setRotation(Leftside2, 0F, 0F, 0F);
      Rightside2 = new ModelRenderer(this, 51, 0);
      Rightside2.addBox(-7F, -4F, -4F, 1, 8, 8);
      Rightside2.setRotationPoint(0F, 0F, 0F);
      Rightside2.setTextureSize(128, 64);
      Rightside2.mirror = true;
      setRotation(Rightside2, 0F, 0F, 0F);
      Bottomside2 = new ModelRenderer(this, 31, 25);
      Bottomside2.addBox(-4F, 5F, -4F, 8, 2, 8);
      Bottomside2.setRotationPoint(0F, 0F, 0F);
      Bottomside2.setTextureSize(128, 64);
      Bottomside2.mirror = true;
      setRotation(Bottomside2, 0F, 0F, 0F);
      Topside2 = new ModelRenderer(this, 31, 25);
      Topside2.addBox(-4F, -7F, -4F, 8, 2, 8);
      Topside2.setRotationPoint(0F, 0F, 0F);
      Topside2.setTextureSize(128, 64);
      Topside2.mirror = true;
      setRotation(Topside2, 0F, 0F, 0F);
      Right_eye = new ModelRenderer(this, 50, 17);
      Right_eye.addBox(-3F, -5F, -7F, 2, 1, 2);
      Right_eye.setRotationPoint(0F, 0F, 0F);
      Right_eye.setTextureSize(128, 64);
      Right_eye.mirror = true;
      setRotation(Right_eye, 0F, 0F, 0F);
      Right_eye.mirror = false;
      Left_eye = new ModelRenderer(this, 50, 17);
      Left_eye.addBox(1F, -5F, -7F, 2, 1, 2);
      Left_eye.setRotationPoint(0F, 0F, 0F);
      Left_eye.setTextureSize(128, 64);
      Left_eye.mirror = true;
      setRotation(Left_eye, 0F, 0F, 0F);
      Left_top_brow = new ModelRenderer(this, 50, 21);
      Left_top_brow.addBox(2F, -6F, -7F, 2, 1, 2);
      Left_top_brow.setRotationPoint(0F, 0F, 0F);
      Left_top_brow.setTextureSize(128, 64);
      Left_top_brow.mirror = true;
      setRotation(Left_top_brow, 0F, 0F, 0F);
      Right_top_brow = new ModelRenderer(this, 50, 21);
      Right_top_brow.addBox(-4F, -6F, -7F, 2, 1, 2);
      Right_top_brow.setRotationPoint(0F, 0F, 0F);
      Right_top_brow.setTextureSize(128, 64);
      Right_top_brow.mirror = true;
      setRotation(Right_top_brow, 0F, 0F, 0F);
      Piece1.addChild(Main);
      Piece1.addChild(Bottomside1);
      Piece1.addChild(Rightside1);
      Piece1.addChild(Leftside1);
      Piece1.addChild(Topside1);
      Piece1.addChild(Backside1);
      Piece1.addChild(Frontside1);
      Piece1.addChild(Bottomside2);
      Piece1.addChild(Rightside2);
      Piece1.addChild(Leftside2);
      Piece1.addChild(Topside2);
      Piece1.addChild(Backside2);
      Piece1.addChild(Frontside2);
      Piece1.addChild(Right_eye);
      Piece1.addChild(Left_eye);
      Piece1.addChild(Left_top_brow);
      Piece1.addChild(Right_top_brow);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Piece1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
    Piece1.rotateAngleX += .5F * f1;
    if(Piece1.rotateAngleX > 2*3.14159F)
    	Piece1.rotateAngleX = 0;
  }

}
