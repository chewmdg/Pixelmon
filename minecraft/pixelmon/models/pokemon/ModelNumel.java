package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelNumel extends ModelBase
{
  //fields
    ModelRenderer neck;
    ModelRenderer forwarddownward1;
    ModelRenderer forwarddownward2;
    ModelRenderer body1;
    ModelRenderer rightleft2;
    ModelRenderer rightleft1;
    ModelRenderer lowerpart;
    ModelRenderer lowpot;
    ModelRenderer uppot;
    ModelRenderer earR;
    ModelRenderer earmidR;
    ModelRenderer earlateralR;
    ModelRenderer earL;
    ModelRenderer earmidL;
    ModelRenderer earlateralL;
    ModelRenderer FRONTLEFTLEGPIECE;
    ModelRenderer BACKLEFTLEGPIECE;
    ModelRenderer FRONTRIGHTLEGPIECE;
    ModelRenderer BACKRIGHTLEGPIECE;
    ModelRenderer headback;
    ModelRenderer nose2;
    ModelRenderer nose1;
    ModelRenderer head2;
    ModelRenderer head1;
    ModelRenderer whisp1;
    ModelRenderer whisp2;
    ModelRenderer whisps;
    ModelRenderer Right_Sizer_1;
    ModelRenderer Right_Sizer_2;
    ModelRenderer Orange_R;
    ModelRenderer White_1_R;
    ModelRenderer White_2_R;
    ModelRenderer White_3_R;
    ModelRenderer Black_R;
    ModelRenderer Ring_Right_R;
    ModelRenderer Ring_Low_R;
    ModelRenderer Ring_High_R;
    ModelRenderer Ring_Left_R;
    ModelRenderer quarter1;
    ModelRenderer quarter2;
    ModelRenderer quarter3;
    ModelRenderer quarter4;
    ModelRenderer Left_Sizer_1;
    ModelRenderer Left_Sizer_2;
    ModelRenderer Orange;
    ModelRenderer Black;
    ModelRenderer White_1;
    ModelRenderer White_2;
    ModelRenderer White_3;
    ModelRenderer ringright;
    ModelRenderer ringbottom;
    ModelRenderer righttop;
    ModelRenderer rightleft;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer quarter11;
    ModelRenderer quarter22;
    ModelRenderer quarter33;
    ModelRenderer quarter44;
    ModelRenderer backright1;
    ModelRenderer backright2;
    ModelRenderer backright3;
    ModelRenderer backleft1;
    ModelRenderer backleft2;
    ModelRenderer backleft3;
    ModelRenderer frontleft1;
    ModelRenderer frontleft2;
    ModelRenderer frontleft3;
    ModelRenderer frontright1;
    ModelRenderer frontright2;
    ModelRenderer frontright3;
    
    
  public ModelNumel()
  {
    textureWidth = 200;
    textureHeight = 200;
    
      neck = new ModelRenderer(this, 42, 23);
      neck.addBox(-1F, -0.5F, -6F, 2, 2, 6);
      neck.setRotationPoint(0F, 18F, -5F);
      neck.setTextureSize(200, 200);
      neck.mirror = true;
      setRotation(neck, -0.8551081F, 0F, 0F);
      forwarddownward1 = new ModelRenderer(this, 0, 38);
      forwarddownward1.addBox(-3F, -3F, -6F, 6, 6, 12);
      forwarddownward1.setRotationPoint(0F, 17F, 0F);
      forwarddownward1.setTextureSize(200, 200);
      forwarddownward1.mirror = true;
      setRotation(forwarddownward1, 0F, 0F, 0F);
      forwarddownward2 = new ModelRenderer(this, 0, 56);
      forwarddownward2.addBox(-2F, -2F, -6.5F, 4, 4, 13);
      forwarddownward2.setRotationPoint(0F, 17F, 0F);
      forwarddownward2.setTextureSize(200, 200);
      forwarddownward2.mirror = true;
      setRotation(forwarddownward2, 0F, 0F, 0F);
      body1 = new ModelRenderer(this, 0, 20);
      body1.addBox(-4F, -4F, -5F, 8, 8, 10);
      body1.setRotationPoint(0F, 17F, 0F);
      body1.setTextureSize(200, 200);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      rightleft2 = new ModelRenderer(this, 0, 73);
      rightleft2.addBox(-5.5F, -2F, -3F, 11, 4, 6);
      rightleft2.setRotationPoint(0F, 17F, 0F);
      rightleft2.setTextureSize(200, 200);
      rightleft2.mirror = true;
      setRotation(rightleft2, 0F, 0F, 0F);
      rightleft1 = new ModelRenderer(this, 0, 83);
      rightleft1.addBox(-5F, -3F, -4F, 10, 6, 8);
      rightleft1.setRotationPoint(0F, 17F, 0F);
      rightleft1.setTextureSize(200, 200);
      rightleft1.mirror = true;
      setRotation(rightleft1, 0F, 0F, 0F);
      lowerpart = new ModelRenderer(this, 0, 97);
      lowerpart.addBox(-1.5F, 1.4F, -6.5F, 3, 3, 7);
      lowerpart.setRotationPoint(0F, 17F, 0F);
      lowerpart.setTextureSize(200, 200);
      lowerpart.mirror = true;
      setRotation(lowerpart, 0F, 0F, 0F);
      lowpot = new ModelRenderer(this, 0, 107);
      lowpot.addBox(-3F, -4.5F, -3F, 6, 1, 7);
      lowpot.setRotationPoint(0F, 17F, 0F);
      lowpot.setTextureSize(200, 200);
      lowpot.mirror = true;
      setRotation(lowpot, 0F, 0F, 0F);
      uppot = new ModelRenderer(this, 0, 115);
      uppot.addBox(-2F, -5.5F, -1F, 4, 1, 4);
      uppot.setRotationPoint(0F, 17F, 0F);
      uppot.setTextureSize(200, 200);
      uppot.mirror = true;
      setRotation(uppot, 0F, 0F, 0F);
      earR = new ModelRenderer(this, 27, 11);
      earR.addBox(-0.5F, -4F, -1F, 1, 4, 2);
      earR.setRotationPoint(1.3F, 11.5F, -7F);
      earR.setTextureSize(200, 200);
      earR.mirror = true;
      setRotation(earR, -0.5235988F, 0F, 0.3490659F);
      earmidR = new ModelRenderer(this, 27, 11);
      earmidR.addBox(-0.5F, -3.5F, -1.5F, 1, 3, 3);
      earmidR.setRotationPoint(1.3F, 11.5F, -7F);
      earmidR.setTextureSize(200, 200);
      earmidR.mirror = true;
      setRotation(earmidR, -0.5235988F, 0F, 0.3490659F);
      earlateralR = new ModelRenderer(this, 27, 11);
      earlateralR.addBox(-1F, -3.5F, -1F, 2, 3, 2);
      earlateralR.setRotationPoint(1.3F, 11.5F, -7F);
      earlateralR.setTextureSize(200, 200);
      earlateralR.mirror = true;
      setRotation(earlateralR, -0.5235988F, 0F, 0.3490659F);

      earL = new ModelRenderer(this, 27, 11);
      earL.addBox(-0.5F, -4F, -1F, 1, 4, 2);
      earL.setRotationPoint(-1.3F, 11.5F, -7F);
      earL.setTextureSize(200, 200);
      earL.mirror = true;
      setRotation(earL, -0.5235988F, 0F, -0.3490659F);
      
      
      earmidL = new ModelRenderer(this, 27, 11);
      earmidL.addBox(-0.5F, -3.5F, -1.5F, 1, 3, 3);
      earmidL.setRotationPoint(-1.3F, 11.5F, -7F);
      earmidL.setTextureSize(200, 200);
      earmidL.mirror = true;
      setRotation(earmidL, -0.5235988F, 0F, -0.3490659F);
      
     
      earlateralL = new ModelRenderer(this, 27, 11);
      earlateralL.addBox(-1F, -3.5F, -1F, 2, 3, 2);
      earlateralL.setRotationPoint(-1.3F, 11.5F, -7F);
      earlateralL.setTextureSize(200, 200);
      earlateralL.mirror = true;
      setRotation(earlateralL, -0.5235988F, 0F, -0.3490659F);
      
    FRONTLEFTLEGPIECE = new ModelRenderer(this, "FRONTLEFTLEGPIECE");
    FRONTLEFTLEGPIECE.setRotationPoint(4.5F, 20F, -4F);
    setRotation(FRONTLEFTLEGPIECE, 0F, 0F, 0F);
    FRONTLEFTLEGPIECE.mirror = true;
      frontleft1 = new ModelRenderer(this, 60, 0);
      frontleft1.addBox(-1F, 0F, -1F, 2, 1, 2);
      frontleft1.setRotationPoint(0F, 0F, 0F);
      frontleft1.setTextureSize(200, 200);
      frontleft1.mirror = true;
      setRotation(frontleft1, 0F, 0F, 0F);
      frontleft2 = new ModelRenderer(this, 60, 0);
      frontleft2.addBox(-1.5F, 1F, -1.5F, 3, 2, 3);
      frontleft2.setRotationPoint(0F, 0F, 0F);
      frontleft2.setTextureSize(200, 200);
      frontleft2.mirror = true;
      setRotation(frontleft2, 0F, 0F, 0F);
      frontleft3 = new ModelRenderer(this, 60, 0);
      frontleft3.addBox(-1F, 3F, -1F, 2, 1, 2);
      frontleft3.setRotationPoint(0F, 0F, 0F);
      frontleft3.setTextureSize(200, 200);
      frontleft3.mirror = true;
      setRotation(frontleft3, 0F, 0F, 0F);
      
    BACKLEFTLEGPIECE = new ModelRenderer(this, "BACKLEFTLEGPIECE");
    BACKLEFTLEGPIECE.setRotationPoint(4F, 19F, 5F);
    setRotation(BACKLEFTLEGPIECE, 0F, 0F, 0F);
    BACKLEFTLEGPIECE.mirror = true;
      backleft2 = new ModelRenderer(this, 60, 10);
      backleft2.addBox(-1.5F, 1F, -1.5F, 3, 3, 3);
      backleft2.setRotationPoint(0F, 0F, 0F);
      backleft2.setTextureSize(200, 200);
      backleft2.mirror = true;
      setRotation(backleft2, 0F, 0F, 0F);
      backleft1 = new ModelRenderer(this, 60, 10);
      backleft1.addBox(-1F, 0F, -1F, 2, 1, 2);
      backleft1.setRotationPoint(0F, 0F, 0F);
      backleft1.setTextureSize(200, 200);
      backleft1.mirror = true;
      setRotation(backleft1, 0F, 0F, 0F);
      backleft3 = new ModelRenderer(this, 60, 10);
      backleft3.addBox(-1F, 4F, -1F, 2, 1, 2);
      backleft3.setRotationPoint(0F, 0F, 0F);
      backleft3.setTextureSize(200, 200);
      backleft3.mirror = true;
      setRotation(backleft3, 0F, 0F, 0F);
      
    FRONTRIGHTLEGPIECE = new ModelRenderer(this, "FRONTRIGHTLEGPIECE");
    FRONTRIGHTLEGPIECE.setRotationPoint(-4.5F, 20F, -4F);
    setRotation(FRONTRIGHTLEGPIECE, 0F, 0F, 0F);
    FRONTRIGHTLEGPIECE.mirror = true;
      frontright1 = new ModelRenderer(this, 60, 0);
      frontright1.addBox(-1F, 0F, -1F, 2, 1, 2);
      frontright1.setRotationPoint(0F, 0F, 0F);
      frontright1.setTextureSize(200, 200);
      frontright1.mirror = true;
      setRotation(frontright1, 0F, 0F, 0F);
      frontright3 = new ModelRenderer(this, 60, 0);
      frontright3.addBox(-1F, 3F, -1F, 2, 1, 2);
      frontright3.setRotationPoint(0F, 0F, 0F);
      frontright3.setTextureSize(200, 200);
      frontright3.mirror = true;
      setRotation(frontright3, 0F, 0F, 0F);
      frontright2 = new ModelRenderer(this, 60, 0);
      frontright2.addBox(-1.5F, 1F, -1.5F, 3, 2, 3);
      frontright2.setRotationPoint(0F, 0F, 0F);
      frontright2.setTextureSize(200, 200);
      frontright2.mirror = true;
      setRotation(frontright2, 0F, 0F, 0F);
      
    BACKRIGHTLEGPIECE = new ModelRenderer(this, "BACKRIGHTLEGPIECE");
    BACKRIGHTLEGPIECE.setRotationPoint(-4F, 19F, 5F);
    setRotation(BACKRIGHTLEGPIECE, 0F, 0F, 0F);
    BACKRIGHTLEGPIECE.mirror = true;
      backright2 = new ModelRenderer(this, 60, 10);
      backright2.addBox(-1.5F, 1F, -1.5F, 3, 3, 3);
      backright2.setRotationPoint(0F, 0F, 0F);
      backright2.setTextureSize(200, 200);
      backright2.mirror = true;
      setRotation(backright2, 0F, 0F, 0F);
      backright3 = new ModelRenderer(this, 60, 10);
      backright3.addBox(-1F, 4F, -1F, 2, 1, 2);
      backright3.setRotationPoint(0F, 0F, 0F);
      backright3.setTextureSize(200, 200);
      backright3.mirror = true;
      setRotation(backright3, 0F, 0F, 0F);
      backright1 = new ModelRenderer(this, 60, 10);
      backright1.addBox(-1F, 0F, -1F, 2, 1, 2);
      backright1.setRotationPoint(0F, 0F, 0F);
      backright1.setTextureSize(200, 200);
      backright1.mirror = true;
      setRotation(backright1, 0F, 0F, 0F);
     
      headback = new ModelRenderer(this, 12, 2);
      headback.addBox(-1.5F, -2.5F, 1.3F, 3, 3, 1);
      headback.setRotationPoint(0F, 14F, -9F);
      headback.setTextureSize(200, 200);
      headback.mirror = true;
      setRotation(headback, 0F, 0F, 0F);
      nose2 = new ModelRenderer(this, 2, 16);
      nose2.addBox(-1F, -2F, -4.6F, 2, 2, 1);
      nose2.setRotationPoint(0F, 14F, -9F);
      nose2.setTextureSize(200, 200);
      nose2.mirror = true;
      setRotation(nose2, 0F, 0F, 0F);
      nose1 = new ModelRenderer(this, 11, 15);
      nose1.addBox(-1.5F, -2.5F, -4F, 3, 3, 1);
      nose1.setRotationPoint(0F, 14F, -9F);
      nose1.setTextureSize(200, 200);
      nose1.mirror = true;
      setRotation(nose1, 0F, 0F, 0F);
      head2 = new ModelRenderer(this, 23, 0);
      head2.addBox(-2F, -2.5F, -3F, 4, 3, 5);
      head2.setRotationPoint(0F, 14F, -9F);
      head2.setTextureSize(200, 200);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      head1 = new ModelRenderer(this, 36, 10);
      head1.addBox(-1.5F, -3F, -3F, 3, 4, 5);
      head1.setRotationPoint(0F, 14F, -9F);
      head1.setTextureSize(200, 200);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0F);
      whisp1 = new ModelRenderer(this, 5, 116);
      whisp1.addBox(0.5F, -3.4F, -0.9F, 0, 1, 1);
      whisp1.setRotationPoint(0F, 14F, -9F);
      whisp1.setTextureSize(200, 200);
      whisp1.mirror = true;
      setRotation(whisp1, 0F, 0F, 0F);
      whisp2 = new ModelRenderer(this, 5, 116);
      whisp2.addBox(-0.5F, -3.4F, -0.9F, 0, 1, 1);
      whisp2.setRotationPoint(0F, 14F, -9F);
      whisp2.setTextureSize(200, 200);
      whisp2.mirror = true;
      setRotation(whisp2, 0F, 0F, 0F);
      whisps = new ModelRenderer(this, 5, 10);
      whisps.addBox(-1F, -3.3F, -0.8F, 2, 2, 2);
      whisps.setRotationPoint(0F, 14F, -9F);
      whisps.setTextureSize(200, 200);
      whisps.mirror = true;
      setRotation(whisps, 0F, 0F, 0F);
      Right_Sizer_1 = new ModelRenderer(this, 1, 1);
      Right_Sizer_1.addBox(-2.2F, -2F, -2.9F, 1, 2, 1);
      Right_Sizer_1.setRotationPoint(0F, 14F, -9F);
      Right_Sizer_1.setTextureSize(200, 200);
      Right_Sizer_1.mirror = true;
      setRotation(Right_Sizer_1, 0F, 0F, 0F);
      Right_Sizer_2 = new ModelRenderer(this, 45, 0);
      Right_Sizer_2.addBox(-2.2F, -2F, -3.1F, 1, 2, 1);
      Right_Sizer_2.setRotationPoint(0F, 14F, -5F);
      Right_Sizer_2.setTextureSize(200, 200);
      Right_Sizer_2.mirror = true;
      setRotation(Right_Sizer_2, 0F, 0F, 0F);
      Orange_R = new ModelRenderer(this, 42, 37);
      Orange_R.addBox(-0.5F, -1F, -1F, 1, 2, 2);
      Orange_R.setRotationPoint(-1.7F, 13F, -9.5F);
      Orange_R.setTextureSize(200, 200);
      Orange_R.mirror = true;
      setRotation(Orange_R, 0F, 0F, 0F);
      White_1_R = new ModelRenderer(this, 83, 8);
      White_1_R.addBox(-0.6F, 0F, -1F, 1, 1, 2);
      White_1_R.setRotationPoint(-1.7F, 13F, -9.5F);
      White_1_R.setTextureSize(200, 200);
      White_1_R.mirror = true;
      setRotation(White_1_R, 0F, 0F, 0F);
      White_2_R = new ModelRenderer(this, 83, 8);
      White_2_R.addBox(-0.6F, -0.5F, -0.9F, 1, 1, 1);
      White_2_R.setRotationPoint(-1.7F, 13F, -9.5F);
      White_2_R.setTextureSize(200, 200);
      White_2_R.mirror = true;
      setRotation(White_2_R, 0F, 0F, 0F);
      White_3_R = new ModelRenderer(this, 83, 8);
      White_3_R.addBox(-0.6F, -0.5F, -0.1F, 1, 1, 1);
      White_3_R.setRotationPoint(-1.7F, 13F, -9.5F);
      White_3_R.setTextureSize(200, 200);
      White_3_R.mirror = true;
      setRotation(White_3_R, 0F, 0F, 0F);
      Black_R = new ModelRenderer(this, 86, 17);
      Black_R.addBox(-0.7F, -0.4F, -0.5F, 1, 1, 1);
      Black_R.setRotationPoint(-1.7F, 13F, -9.5F);
      Black_R.setTextureSize(200, 200);
      Black_R.mirror = true;
      setRotation(Black_R, 0F, 0F, 0F);
      Ring_Right_R = new ModelRenderer(this, 71, 28);
      Ring_Right_R.addBox(-0.4F, -1F, -1.4F, 1, 2, 1);
      Ring_Right_R.setRotationPoint(-1.7F, 13F, -9.5F);
      Ring_Right_R.setTextureSize(200, 200);
      Ring_Right_R.mirror = true;
      setRotation(Ring_Right_R, 0F, 0F, 0F);
      Ring_Low_R = new ModelRenderer(this, 71, 28);
      Ring_Low_R.addBox(-0.4F, -0.6F, -1F, 1, 1, 2);
      Ring_Low_R.setRotationPoint(-1.7F, 14F, -9.5F);
      Ring_Low_R.setTextureSize(200, 200);
      Ring_Low_R.mirror = true;
      setRotation(Ring_Low_R, 0F, 0F, 0F);
      Ring_High_R = new ModelRenderer(this, 71, 28);
      Ring_High_R.addBox(-0.4F, -1.4F, -1F, 1, 1, 2);
      Ring_High_R.setRotationPoint(-1.7F, 13F, -9.5F);
      Ring_High_R.setTextureSize(200, 200);
      Ring_High_R.mirror = true;
      setRotation(Ring_High_R, 0F, 0F, 0F);
      Ring_Left_R = new ModelRenderer(this, 71, 28);
      Ring_Left_R.addBox(-0.4F, -1F, 0.4F, 1, 2, 1);
      Ring_Left_R.setRotationPoint(-1.7F, 13F, -9.5F);
      Ring_Left_R.setTextureSize(200, 200);
      Ring_Left_R.mirror = true;
      setRotation(Ring_Left_R, 0F, 0F, 0F);
      quarter11 = new ModelRenderer(this, 71, 28);
      quarter11.addBox(-0.4F, -1.2F, -1.2F, 1, 1, 1);
      quarter11.setRotationPoint(-1.7F, 13F, -9.5F);
      quarter11.setTextureSize(200, 200);
      quarter11.mirror = true;
      setRotation(quarter11, 0F, 0F, 0F);
      quarter22 = new ModelRenderer(this, 71, 28);
      quarter22.addBox(-0.4F, -1.2F, 0.2F, 1, 1, 1);
      quarter22.setRotationPoint(-1.7F, 13F, -9.5F);
      quarter22.setTextureSize(200, 200);
      quarter22.mirror = true;
      setRotation(quarter22, 0F, 0F, 0F);
      quarter33 = new ModelRenderer(this, 71, 28);
      quarter33.addBox(-0.4F, 0.2F, -1.2F, 1, 1, 1);
      quarter33.setRotationPoint(-1.7F, 13F, -9.5F);
      quarter33.setTextureSize(200, 200);
      quarter33.mirror = true;
      setRotation(quarter33, 0F, 0F, 0F);
      quarter44 = new ModelRenderer(this, 71, 28);
      quarter44.addBox(-0.4F, 0.2F, 0.2F, 1, 1, 1);
      quarter44.setRotationPoint(-1.7F, 13F, -9.5F);
      quarter44.setTextureSize(200, 200);
      quarter44.mirror = true;
      setRotation(quarter44, 0F, 0F, 0F);
      Left_Sizer_1 = new ModelRenderer(this, 1, 1);
      Left_Sizer_1.addBox(1.2F, -2F, -2.9F, 1, 2, 1);
      Left_Sizer_1.setRotationPoint(0F, 14F, -9F);
      Left_Sizer_1.setTextureSize(200, 200);
      Left_Sizer_1.mirror = true;
      setRotation(Left_Sizer_1, 0F, 0F, 0F);
      Left_Sizer_2 = new ModelRenderer(this, 45, 0);
      Left_Sizer_2.addBox(1.2F, -2F, -3.1F, 1, 2, 1);
      Left_Sizer_2.setRotationPoint(0F, 14F, -5F);
      Left_Sizer_2.setTextureSize(200, 200);
      Left_Sizer_2.mirror = true;
      setRotation(Left_Sizer_2, 0F, 0F, 0F);
      Orange = new ModelRenderer(this, 42, 37);
      Orange.addBox(0.5F, -1F, -1F, 1, 2, 2);
      Orange.setRotationPoint(0.7F, 13F, -9.5F);
      Orange.setTextureSize(200, 200);
      Orange.mirror = true;
      setRotation(Orange, 0F, 0F, 0F);
      Black = new ModelRenderer(this, 86, 17);
      Black.addBox(0.7F, -0.4F, -0.5F, 1, 1, 1);
      Black.setRotationPoint(0.7F, 13F, -9.5F);
      Black.setTextureSize(200, 200);
      Black.mirror = true;
      setRotation(Black, 0F, 0F, 0F);
      White_1 = new ModelRenderer(this, 83, 8);
      White_1.addBox(0.6F, 0F, -1F, 1, 1, 2);
      White_1.setRotationPoint(0.7F, 13F, -9.5F);
      White_1.setTextureSize(200, 200);
      White_1.mirror = true;
      setRotation(White_1, 0F, 0F, 0F);
      White_2 = new ModelRenderer(this, 83, 8);
      White_2.addBox(0.6F, -0.5F, -0.9F, 1, 1, 1);
      White_2.setRotationPoint(0.7F, 13F, -9.5F);
      White_2.setTextureSize(200, 200);
      White_2.mirror = true;
      setRotation(White_2, 0F, 0F, 0F);
      White_3 = new ModelRenderer(this, 83, 8);
      White_3.addBox(0.6F, -0.5F, -0.1F, 1, 1, 1);
      White_3.setRotationPoint(0.7F, 13F, -9.5F);
      White_3.setTextureSize(200, 200);
      White_3.mirror = true;
      setRotation(White_3, 0F, 0F, 0F);
      ringright = new ModelRenderer(this, 71, 28);
      ringright.addBox(0.4F, -1F, -1.4F, 1, 2, 1);
      ringright.setRotationPoint(0.7F, 13F, -9.5F);
      ringright.setTextureSize(200, 200);
      ringright.mirror = true;
      setRotation(ringright, 0F, 0F, 0F);
      ringbottom = new ModelRenderer(this, 71, 28);
      ringbottom.addBox(0.4F, -0.6F, -1F, 1, 1, 2);
      ringbottom.setRotationPoint(0.7F, 14F, -9.5F);
      ringbottom.setTextureSize(200, 200);
      ringbottom.mirror = true;
      setRotation(ringbottom, 0F, 0F, 0F);
      righttop = new ModelRenderer(this, 71, 28);
      righttop.addBox(0.4F, -1.4F, -1F, 1, 1, 2);
      righttop.setRotationPoint(0.7F, 13F, -9.5F);
      righttop.setTextureSize(200, 200);
      righttop.mirror = true;
      setRotation(righttop, 0F, 0F, 0F);
      rightleft = new ModelRenderer(this, 71, 28);
      rightleft.addBox(0.4F, -1F, 0.4F, 1, 2, 1);
      rightleft.setRotationPoint(0.7F, 13F, -9.5F);
      rightleft.setTextureSize(200, 200);
      rightleft.mirror = true;
      setRotation(rightleft, 0F, 0F, 0F);
      quarter1 = new ModelRenderer(this, 71, 28);
      quarter1.addBox(0.4F, -1.2F, -1.2F, 1, 1, 1);
      quarter1.setRotationPoint(0.7F, 13F, -9.5F);
      quarter1.setTextureSize(200, 200);
      quarter1.mirror = true;
      setRotation(quarter1, 0F, 0F, 0F);
      quarter2 = new ModelRenderer(this, 71, 28);
      quarter2.addBox(0.4F, -1.2F, 0.2F, 1, 1, 1);
      quarter2.setRotationPoint(0.7F, 13F, -9.5F);
      quarter2.setTextureSize(200, 200);
      quarter2.mirror = true;
      setRotation(quarter2, 0F, 0F, 0F);
      quarter3 = new ModelRenderer(this, 71, 28);
      quarter3.addBox(0.4F, 0.2F, -1.2F, 1, 1, 1);
      quarter3.setRotationPoint(0.7F, 13F, -9.5F);
      quarter3.setTextureSize(200, 200);
      quarter3.mirror = true;
      setRotation(quarter3, 0F, 0F, 0F);
      quarter4 = new ModelRenderer(this, 71, 28);
      quarter4.addBox(0.4F, 0.2F, 0.2F, 1, 1, 1);
      quarter4.setRotationPoint(0.7F, 13F, -9.5F);
      quarter4.setTextureSize(200, 200);
      quarter4.mirror = true;
      setRotation(quarter4, 0F, 0F, 0F);
    Neck = new ModelRenderer(this, "Neck");
    Neck.setRotationPoint(0F, 18F, -5F);
    setRotation(Neck, 0F, 0F, 0F);
    Neck.mirror = true;
    Head = new ModelRenderer(this, "Head");
    Head.setRotationPoint(0F, 14F, -9F);
    setRotation(Head, 0F, 0F, 0F);
    Head.mirror = true;
    
    
    
    BACKLEFTLEGPIECE.addChild(backleft1);
    BACKLEFTLEGPIECE.addChild(backleft2);
    BACKLEFTLEGPIECE.addChild(backleft3);
    
    BACKRIGHTLEGPIECE.addChild(backright1);
    BACKRIGHTLEGPIECE.addChild(backright2);
    BACKRIGHTLEGPIECE.addChild(backright3);
    
    FRONTRIGHTLEGPIECE.addChild(frontright1);
    FRONTRIGHTLEGPIECE.addChild(frontright2);
    FRONTRIGHTLEGPIECE.addChild(frontright3);
    
    FRONTLEFTLEGPIECE.addChild(frontleft1);
    FRONTLEFTLEGPIECE.addChild(frontleft2);
    FRONTLEFTLEGPIECE.addChild(frontleft3);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    neck.render(f5);
    forwarddownward1.render(f5);
    forwarddownward2.render(f5);
    body1.render(f5);
    rightleft2.render(f5);
    rightleft1.render(f5);
    lowerpart.render(f5);
    lowpot.render(f5);
    uppot.render(f5);
    earR.render(f5);
    earmidR.render(f5);
    earlateralR.render(f5);
    earL.render(f5);
    earmidL.render(f5);
    FRONTLEFTLEGPIECE.render(f5);
    FRONTRIGHTLEGPIECE.render(f5);
    BACKLEFTLEGPIECE.render(f5);
    BACKRIGHTLEGPIECE.render(f5);
    headback.render(f5);
    nose2.render(f5);
    nose1.render(f5);
    head2.render(f5);
    head1.render(f5);
    whisp1.render(f5);
    whisp2.render(f5);
    whisps.render(f5);
    Right_Sizer_1.render(f5);
    Right_Sizer_2.render(f5);
    Orange_R.render(f5);
    White_1_R.render(f5);
    White_2_R.render(f5);
    White_3_R.render(f5);
    Black_R.render(f5);
    Ring_Right_R.render(f5);
    Ring_Low_R.render(f5);
    Ring_High_R.render(f5);
    Ring_Left_R.render(f5);
    quarter1.render(f5);
    quarter2.render(f5);
    quarter3.render(f5);
    quarter4.render(f5);
    Left_Sizer_1.render(f5);
    Left_Sizer_2.render(f5);
    Orange.render(f5);
    Black.render(f5);
    White_1.render(f5);
    White_2.render(f5);
    White_3.render(f5);
    ringright.render(f5);
    ringbottom.render(f5);
    righttop.render(f5);
    rightleft.render(f5);
    quarter11.render(f5);
    quarter22.render(f5);
    quarter33.render(f5);
    quarter44.render(f5);
    
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
    FRONTLEFTLEGPIECE.rotateAngleX=MathHelper.cos(f*1F)*1F*f1;
    BACKRIGHTLEGPIECE.rotateAngleX=MathHelper.cos(f*1F)*1F*f1;
    FRONTRIGHTLEGPIECE.rotateAngleX=MathHelper.cos(f*1F + (float)Math.PI)*1F*f1;
    BACKLEFTLEGPIECE.rotateAngleX=MathHelper.cos(f*1F + (float)Math.PI)*1F*f1;
  }

}
