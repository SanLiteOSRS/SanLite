import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class304 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -623051517
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1158912423
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1414441601
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("ad")
	static AtomicBoolean field3392;
	@ObfuscatedName("ac")
	static ThreadPoolExecutor field3393;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 472839149
	)
	public static int field3385;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1895494173
	)
	public static int field3395;
	@ObfuscatedName("ah")
	public static final List field3388;
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("compass")
	static SpritePixels compass;

	static {
		musicPlayerStatus = 0; // L: 20
		field3392 = null; // L: 29
		field3393 = null; // L: 30
		field3385 = -1; // L: 31
		field3395 = -1; // L: 32
		field3388 = new ArrayList(); // L: 33
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILmg;ZB)V",
		garbageValue = "21"
	)
	static void method5715(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class230.getWorldMap().getMapArea(var0); // L: 5260
		int var4 = Projectile.localPlayer.plane; // L: 5261
		int var5 = class213.baseX * 64 + (Projectile.localPlayer.x >> 7); // L: 5262
		int var6 = class101.baseY * 64 + (Projectile.localPlayer.y >> 7); // L: 5263
		Coord var7 = new Coord(var4, var5, var6); // L: 5264
		class230.getWorldMap().method8402(var3, var7, var1, var2); // L: 5265
	} // L: 5266
}
