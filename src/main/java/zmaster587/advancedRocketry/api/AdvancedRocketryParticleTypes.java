package zmaster587.advancedRocketry.api;

import net.minecraft.client.Minecraft;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import zmaster587.advancedRocketry.entity.fx.FxElectricArc;
import zmaster587.advancedRocketry.entity.fx.FxGravityEffect;
import zmaster587.advancedRocketry.entity.fx.InverseTrailFluid;
import zmaster587.advancedRocketry.entity.fx.InverseTrailFx;
import zmaster587.advancedRocketry.entity.fx.OxygenCloudFX;
import zmaster587.advancedRocketry.entity.fx.OxygenTraceFX;
import zmaster587.advancedRocketry.entity.fx.RocketFx;
import zmaster587.advancedRocketry.entity.fx.TrailFx;

public class AdvancedRocketryParticleTypes {

	
	
	private static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Constants.modId);
	
	
	public static void init()
	{
		PARTICLE_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static BasicParticleType fxElectricArc;
	public static BasicParticleType fxGravityEffect;
	//public static RegistryObject<BasicParticleType> fxLaser;
	//public static RegistryObject<BasicParticleType> fxLaserHeat;
	//public static RegistryObject<BasicParticleType> fxLaserSpark;
	public static BasicParticleType inverseTrailFluid;
	public static BasicParticleType inverseTrailFx;
	public static BasicParticleType oxygenCloudFx;
	public static BasicParticleType oxygenTraceFx;
	public static BasicParticleType rocketFx;
	public static BasicParticleType trailFx;

	public static void registerParticles(RegistryEvent.Register<ParticleType<?>> evt) {
		fxElectricArc = new BasicParticleType(true);
		fxElectricArc.setRegistryName("advancedrocketry:electricarc");
		
		
		fxGravityEffect = new BasicParticleType(true);
		fxGravityEffect.setRegistryName("advancedrocketry:gravityeffect");
		
		inverseTrailFluid =  new BasicParticleType(true);
		inverseTrailFluid.setRegistryName("advancedrocketry:inversetrailfluid");
		
		inverseTrailFx = new BasicParticleType(true);
		inverseTrailFx.setRegistryName("advancedrocketry:inversetrailfx");
		
		oxygenCloudFx = new BasicParticleType(true);
		oxygenCloudFx.setRegistryName("advancedrocketry:oxygencloudfx");
		
		oxygenTraceFx = new BasicParticleType(true);
		oxygenTraceFx.setRegistryName("advancedrocketry:oxygentracefx");
		
		rocketFx = new BasicParticleType(true);
		rocketFx.setRegistryName("advancedrocketry:rocketfx");
		
		
		trailFx = new BasicParticleType(true);
		trailFx.setRegistryName("advancedrocketry:trailfx");
		
		evt.getRegistry().registerAll(
				fxElectricArc, 
				fxGravityEffect,
				inverseTrailFluid,
				inverseTrailFx,
				oxygenCloudFx,
				oxygenTraceFx,
				rocketFx,
				trailFx);
	}
	
	public static void registerParticles(ParticleFactoryRegisterEvent evt)
	{
		
		Minecraft.getInstance().particles.registerFactory(fxElectricArc, FxElectricArc.Factory::new);
		Minecraft.getInstance().particles.registerFactory(fxGravityEffect, FxGravityEffect.Factory::new);
		//Minecraft.getInstance().particles.registerFactory(fxLaser, FxLaser.Factory::new);
		//Minecraft.getInstance().particles.registerFactory(fxLaserHeat, FxLaserHeat.Factory::new);
		//Minecraft.getInstance().particles.registerFactory(fxLaserSpark, FxLaserSpark.Factory::new);
		Minecraft.getInstance().particles.registerFactory(inverseTrailFluid, InverseTrailFluid.Factory::new);
		Minecraft.getInstance().particles.registerFactory(inverseTrailFx, InverseTrailFx.Factory::new);
		Minecraft.getInstance().particles.registerFactory(oxygenCloudFx, OxygenCloudFX.Factory::new);
		Minecraft.getInstance().particles.registerFactory(oxygenTraceFx, OxygenTraceFX.Factory::new);
		Minecraft.getInstance().particles.registerFactory(rocketFx, RocketFx.Factory::new);
		Minecraft.getInstance().particles.registerFactory(trailFx, TrailFx.Factory::new);
		

	}
}