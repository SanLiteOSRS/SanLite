import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("f")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1217818029"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Loj;Loj;I)I",
		garbageValue = "-234814145"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-32"
	)
	static int method7354(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 440
			return Canvas.method327(var0, var1, var2);
		} else if (var0 < 1100) { // L: 441
			return class313.method6248(var0, var1, var2);
		} else if (var0 < 1200) { // L: 442
			return class467.method8672(var0, var1, var2);
		} else if (var0 < 1300) { // L: 443
			return class101.method2560(var0, var1, var2);
		} else if (var0 < 1400) { // L: 444
			return ItemContainer.method2219(var0, var1, var2);
		} else if (var0 < 1500) { // L: 445
			return class305.method6209(var0, var1, var2);
		} else if (var0 < 1600) { // L: 446
			return GameObject.method4663(var0, var1, var2);
		} else if (var0 < 1700) { // L: 447
			return class131.method2955(var0, var1, var2);
		} else if (var0 < 1800) { // L: 448
			return class203.method4052(var0, var1, var2);
		} else if (var0 < 1900) { // L: 449
			return class9.method76(var0, var1, var2);
		} else if (var0 < 2000) { // L: 450
			return RouteStrategy.method4044(var0, var1, var2);
		} else if (var0 < 2100) { // L: 451
			return class313.method6248(var0, var1, var2);
		} else if (var0 < 2200) { // L: 452
			return class467.method8672(var0, var1, var2);
		} else if (var0 < 2300) { // L: 453
			return class101.method2560(var0, var1, var2);
		} else if (var0 < 2400) { // L: 454
			return ItemContainer.method2219(var0, var1, var2);
		} else if (var0 < 2500) { // L: 455
			return class305.method6209(var0, var1, var2);
		} else if (var0 < 2600) { // L: 456
			return Buddy.method7457(var0, var1, var2);
		} else if (var0 < 2700) { // L: 457
			return ClientPreferences.method2471(var0, var1, var2);
		} else if (var0 < 2800) { // L: 458
			return class13.method172(var0, var1, var2);
		} else if (var0 < 2900) { // L: 459
			return ClanSettings.method3078(var0, var1, var2);
		} else if (var0 < 3000) { // L: 460
			return RouteStrategy.method4044(var0, var1, var2);
		} else if (var0 < 3200) { // L: 461
			return class273.method5374(var0, var1, var2);
		} else if (var0 < 3300) { // L: 462
			return SequenceDefinition.method3890(var0, var1, var2);
		} else if (var0 < 3400) { // L: 463
			return Frames.method4469(var0, var1, var2);
		} else if (var0 < 3500) { // L: 464
			return class136.method2991(var0, var1, var2);
		} else if (var0 < 3600) { // L: 465
			return WorldMapDecorationType.method6237(var0, var1, var2);
		} else if (var0 < 3700) { // L: 466
			return class28.method412(var0, var1, var2);
		} else if (var0 < 3800) { // L: 467
			return class7.method49(var0, var1, var2);
		} else if (var0 < 3900) { // L: 468
			return class37.method711(var0, var1, var2);
		} else if (var0 < 4000) { // L: 469
			return DirectByteArrayCopier.method6228(var0, var1, var2);
		} else if (var0 < 4100) { // L: 470
			return Actor.method2332(var0, var1, var2);
		} else if (var0 < 4200) { // L: 471
			return Actor.method2334(var0, var1, var2);
		} else if (var0 < 4300) { // L: 472
			return class321.method6264(var0, var1, var2);
		} else if (var0 < 5100) { // L: 473
			return class174.method3400(var0, var1, var2);
		} else if (var0 < 5400) { // L: 474
			return class152.method3188(var0, var1, var2);
		} else if (var0 < 5600) { // L: 475
			return UserComparator3.method2774(var0, var1, var2);
		} else if (var0 < 5700) { // L: 476
			return class32.method477(var0, var1, var2);
		} else if (var0 < 6300) { // L: 477
			return class273.method5380(var0, var1, var2);
		} else if (var0 < 6600) { // L: 478
			return class86.method2250(var0, var1, var2);
		} else if (var0 < 6700) { // L: 479
			return ModeWhere.method6595(var0, var1, var2);
		} else if (var0 < 6800) { // L: 480
			return Message.method1161(var0, var1, var2);
		} else if (var0 < 6900) { // L: 481
			return class121.method2823(var0, var1, var2);
		} else if (var0 < 7000) { // L: 482
			return Client.method1243(var0, var1, var2);
		} else if (var0 < 7100) { // L: 483
			return class9.method66(var0, var1, var2);
		} else if (var0 < 7200) { // L: 484
			return GameBuild.method6255(var0, var1, var2);
		} else if (var0 < 7300) { // L: 485
			return WorldMapData_1.method5020(var0, var1, var2);
		} else if (var0 < 7500) { // L: 486
			return class131.method2956(var0, var1, var2);
		} else if (var0 < 7600) { // L: 487
			return class26.method393(var0, var1, var2);
		} else {
			return var0 < 7700 ? WorldMapSprite.method5155(var0, var1, var2) : 2; // L: 488 489
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Llg;Ljava/lang/String;Ljava/lang/String;I)Lry;",
		garbageValue = "76179728"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 157
		int var4 = var0.getFileId(var3, var2); // L: 158
		byte[] var7 = var0.takeFile(var3, var4); // L: 163
		boolean var6;
		if (var7 == null) { // L: 164
			var6 = false; // L: 165
		} else {
			class335.SpriteBuffer_decode(var7); // L: 168
			var6 = true; // L: 169
		}

		IndexedSprite var5;
		if (!var6) { // L: 171
			var5 = null; // L: 172
		} else {
			IndexedSprite var8 = new IndexedSprite(); // L: 177
			var8.width = class477.SpriteBuffer_spriteWidth; // L: 178
			var8.height = class477.SpriteBuffer_spriteHeight; // L: 179
			var8.xOffset = class451.SpriteBuffer_xOffsets[0]; // L: 180
			var8.yOffset = class319.SpriteBuffer_yOffsets[0]; // L: 181
			var8.subWidth = class450.SpriteBuffer_spriteWidths[0]; // L: 182
			var8.subHeight = class477.SpriteBuffer_spriteHeights[0] * 934214685; // L: 183
			var8.palette = class477.SpriteBuffer_spritePalette; // L: 184
			var8.pixels = class453.SpriteBuffer_pixels[0]; // L: 185
			class451.SpriteBuffer_xOffsets = null; // L: 187
			class319.SpriteBuffer_yOffsets = null; // L: 188
			class450.SpriteBuffer_spriteWidths = null; // L: 189
			class477.SpriteBuffer_spriteHeights = null; // L: 190
			class477.SpriteBuffer_spritePalette = null; // L: 191
			class453.SpriteBuffer_pixels = null; // L: 192
			var5 = var8; // L: 196
		}

		return var5; // L: 198
	}
}
