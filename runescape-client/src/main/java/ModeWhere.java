import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("ModeWhere")
public enum ModeWhere implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4306("", 0, new class351[]{class351.field4281}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4302("", 1, new class351[]{class351.field4280, class351.field4281}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4301("", 2, new class351[]{class351.field4280, class351.field4282, class351.field4281}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4313("", 3, new class351[]{class351.field4280}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4305("", 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4303("", 5, new class351[]{class351.field4280, class351.field4281}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4307("", 6, new class351[]{class351.field4281}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4312("", 8, new class351[]{class351.field4280, class351.field4281}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4309("", 9, new class351[]{class351.field4280, class351.field4282}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4310("", 10, new class351[]{class351.field4280}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4311("", 11, new class351[]{class351.field4280}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4314("", 12, new class351[]{class351.field4280, class351.field4281}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field4308("", 13, new class351[]{class351.field4280});

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2063405181
	)
	@Export("id")
	final int id;
	@ObfuscatedName("am")
	final Set field4315;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lnu;)V"
	)
	ModeWhere(String var3, int var4, class351[] var5) {
		this.field4315 = new HashSet();
		this.id = var4; // L: 39
		class351[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class351 var8 = var6[var7]; // L: 43
			this.field4315.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field4315 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 51
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16024"
	)
	public static int method6668() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 50
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "114"
	)
	static void method6667() {
		if (Login.clearLoginScreen) { // L: 316
			WorldMapSprite.titleboxSprite = null; // L: 317
			Login.field912 = null; // L: 318
			Login.field888 = null; // L: 319
			Login.leftTitleSprite = null; // L: 320
			class419.rightTitleSprite = null; // L: 321
			Login.logoSprite = null; // L: 322
			class139.title_muteSprite = null; // L: 323
			Login.field892 = null; // L: 324
			Login.field904 = null; // L: 325
			WorldMapSection2.worldSelectBackSprites = null; // L: 326
			class279.worldSelectFlagSprites = null; // L: 327
			class353.worldSelectArrows = null; // L: 328
			class293.worldSelectStars = null; // L: 329
			FriendSystem.field801 = null; // L: 330
			ArchiveDiskActionHandler.loginScreenRunesAnimation.method2418(); // L: 331
			class293.musicPlayerStatus = 1; // L: 333
			class364.musicTrackArchive = null; // L: 334
			IntHashTable.musicTrackGroupId = -1; // L: 335
			class293.musicTrackFileId = -1; // L: 336
			class368.musicTrackVolume = 0; // L: 337
			class293.musicTrackBoolean = false; // L: 338
			AbstractRasterProvider.pcmSampleLength = 2; // L: 339
			class166.method3383(true); // L: 341
			Login.clearLoginScreen = false; // L: 342
		}
	} // L: 343
}
