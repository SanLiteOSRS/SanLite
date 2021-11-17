import java.awt.Component;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3803("", 0, new class301[]{class301.field3769}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3791("", 1, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3792("", 2, new class301[]{class301.field3770, class301.field3767, class301.field3769}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3793("", 3, new class301[]{class301.field3770}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3794("", 4),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3796("", 5, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3807("", 6, new class301[]{class301.field3769}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3790("", 8, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3798("", 9, new class301[]{class301.field3770, class301.field3767}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3799("", 10, new class301[]{class301.field3770}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3800("", 11, new class301[]{class301.field3770}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3801("", 12, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3802("", 13, new class301[]{class301.field3770});

	@ObfuscatedName("hs")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1276405955
	)
	@Export("id")
	final int id;
	@ObfuscatedName("l")
	final Set field3804;

	static {
		method5536();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkq;)V"
	)
	ModeWhere(String var3, int var4, class301[] var5) {
		this.field3804 = new HashSet();
		this.id = var4;
		class301[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class301 var8 = var6[var7];
			this.field3804.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3804 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "84"
	)
	static void method5543(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)[Lks;",
		garbageValue = "-88"
	)
	static ModeWhere[] method5536() {
		return new ModeWhere[]{field3802, field3803, field3801, field3790, field3792, field3796, field3791, field3807, field3793, field3799, field3794, field3798, field3800};
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	public static void method5542() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1212689938"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field710) {
			WorldMapCacheName.method4027();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class408.clientPreferences.musicVolume != 0 && !Client.field710) {
			Archive var1 = Messages.archive6;
			int var2 = class408.clientPreferences.musicVolume;
			class247.musicPlayerStatus = 1;
			class128.musicTrackArchive = var1;
			class411.musicTrackGroupId = var0;
			ArchiveDiskActionHandler.musicTrackFileId = 0;
			class247.musicTrackVolume = var2;
			SecureRandomCallable.musicTrackBoolean = false;
			class247.pcmSampleLength = 2;
		}

		Client.currentTrackGroupId = var0;
	}
}
