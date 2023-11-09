import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fz")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("b")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1732860883
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-13"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-2049496146"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	} // L: 37

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1386568227"
	)
	static int method3279(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 436
			return WallObject.method4420(var0, var1, var2);
		} else if (var0 < 1100) { // L: 437
			return Coord.method5485(var0, var1, var2);
		} else if (var0 < 1200) { // L: 438
			return GrandExchangeOfferOwnWorldComparator.method1081(var0, var1, var2);
		} else if (var0 < 1300) { // L: 439
			return class14.method170(var0, var1, var2);
		} else if (var0 < 1400) { // L: 440
			return class142.method2982(var0, var1, var2);
		} else if (var0 < 1500) { // L: 441
			return MouseRecorder.method2072(var0, var1, var2);
		} else if (var0 < 1600) { // L: 442
			return ClanChannelMember.method2819(var0, var1, var2);
		} else if (var0 < 1700) { // L: 443
			return GrandExchangeEvent.method5931(var0, var1, var2);
		} else if (var0 < 1800) { // L: 444
			return WorldMapLabelSize.method4451(var0, var1, var2);
		} else if (var0 < 1900) { // L: 445
			return SecureRandomFuture.method1932(var0, var1, var2);
		} else if (var0 < 2000) { // L: 446
			return method3277(var0, var1, var2);
		} else if (var0 < 2100) { // L: 447
			return Coord.method5485(var0, var1, var2);
		} else if (var0 < 2200) { // L: 448
			return GrandExchangeOfferOwnWorldComparator.method1081(var0, var1, var2);
		} else if (var0 < 2300) { // L: 449
			return class14.method170(var0, var1, var2);
		} else if (var0 < 2400) { // L: 450
			return class142.method2982(var0, var1, var2);
		} else if (var0 < 2500) { // L: 451
			return MouseRecorder.method2072(var0, var1, var2);
		} else if (var0 < 2600) { // L: 452
			return class165.method3253(var0, var1, var2);
		} else if (var0 < 2700) { // L: 453
			return ChatChannel.method1964(var0, var1, var2);
		} else if (var0 < 2800) { // L: 454
			return UserComparator8.method2553(var0, var1, var2);
		} else if (var0 < 2900) { // L: 455
			return class14.method179(var0, var1, var2);
		} else if (var0 < 3000) { // L: 456
			return method3277(var0, var1, var2);
		} else if (var0 < 3200) { // L: 457
			return class142.method2989(var0, var1, var2);
		} else if (var0 < 3300) { // L: 458
			return class136.method2878(var0, var1, var2);
		} else if (var0 < 3400) { // L: 459
			return class296.method5654(var0, var1, var2);
		} else if (var0 < 3500) { // L: 460
			return class124.method2768(var0, var1, var2);
		} else if (var0 < 3600) { // L: 461
			return class321.method5912(var0, var1, var2);
		} else if (var0 < 3700) { // L: 462
			return class67.method1862(var0, var1, var2);
		} else if (var0 < 3800) { // L: 463
			return class21.method294(var0, var1, var2);
		} else if (var0 < 3900) { // L: 464
			return class135.method2870(var0, var1, var2);
		} else if (var0 < 4000) { // L: 465
			return class436.method7535(var0, var1, var2);
		} else if (var0 < 4100) { // L: 466
			return class93.method2345(var0, var1, var2);
		} else if (var0 < 4200) {
			return SoundCache.method744(var0, var1, var2); // L: 467
		} else if (var0 < 4300) { // L: 468
			return DefaultsGroup.method6838(var0, var1, var2);
		} else if (var0 < 5100) { // L: 469
			return Login.method1879(var0, var1, var2);
		} else if (var0 < 5400) { // L: 470
			return class167.method3266(var0, var1, var2);
		} else if (var0 < 5600) { // L: 471
			return WorldMapSection0.method4868(var0, var1, var2);
		} else if (var0 < 5700) { // L: 472
			return Script.method1947(var0, var1, var2);
		} else if (var0 < 6300) { // L: 473
			return class267.method5148(var0, var1, var2);
		} else if (var0 < 6600) { // L: 474
			return SecureRandomCallable.method2026(var0, var1, var2);
		} else if (var0 < 6700) { // L: 475
			return class11.method104(var0, var1, var2);
		} else if (var0 < 6800) { // L: 476
			return class101.method2514(var0, var1, var2);
		} else if (var0 < 6900) { // L: 477
			return MouseHandler.method569(var0, var1, var2);
		} else if (var0 < 7000) { // L: 478
			return class138.method2896(var0, var1, var2);
		} else if (var0 < 7100) { // L: 479
			return ArchiveDisk.method6836(var0, var1, var2);
		} else if (var0 < 7200) { // L: 480
			return Strings.method5685(var0, var1, var2);
		} else if (var0 < 7300) { // L: 481
			return UserComparator3.method2575(var0, var1, var2);
		} else if (var0 < 7500) { // L: 482
			return KitDefinition.method3336(var0, var1, var2);
		} else if (var0 < 7600) { // L: 483
			return VarbitComposition.method3502(var0, var1, var2);
		} else {
			return var0 < 7700 ? class83.method2079(var0, var1, var2) : 2; // L: 484 485
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1121646092"
	)
	static int method3277(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1280
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1297
				var7 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1298
				var4 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1299
				if (var4 >= 1 && var4 <= 10) { // L: 1300
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId); // L: 1303
					Interpreter.field831.add(var8); // L: 1304
					return 1; // L: 1305
				} else {
					throw new RuntimeException(); // L: 1301
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1307
				Nameable.Interpreter_intStackSize -= 3; // L: 1308
				int var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 1309
				var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 1310
				int var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 1311
				if (var5 >= 1 && var5 <= 10) { // L: 1312
					class93 var6 = new class93(var5, var3, var4, HitSplatDefinition.getWidget(var3).itemId); // L: 1315
					Interpreter.field831.add(var6); // L: 1316
					return 1; // L: 1317
				} else {
					throw new RuntimeException(); // L: 1313
				}
			} else {
				return 2; // L: 1319
			}
		} else if (Interpreter.field830 >= 10) { // L: 1281
			throw new RuntimeException(); // L: 1282
		} else {
			if (var0 >= 2000) { // L: 1285
				var7 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1286
			} else {
				var7 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 1288
			}

			if (var7.onResize == null) { // L: 1289
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1290
				var9.widget = var7; // L: 1291
				var9.args = var7.onResize; // L: 1292
				var9.field1039 = Interpreter.field830 + 1; // L: 1293
				Client.scriptEvents.addFirst(var9); // L: 1294
				return 1; // L: 1295
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILkn;IIIII[FS)Lkn;",
		garbageValue = "167"
	)
	static Widget method3278(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 920
		var8.type = var0; // L: 921
		var8.parentId = var1.id; // L: 922
		var8.childIndex = var2; // L: 923
		var8.isIf3 = true; // L: 924
		var8.xAlignment = var3; // L: 925
		var8.yAlignment = var4; // L: 926
		var8.widthAlignment = var5; // L: 927
		var8.heightAlignment = var6; // L: 928
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 929
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 930
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 931
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 932
		return var8; // L: 933
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2056881446"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3610
			VarcInt.method3328(); // L: 3611
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && FriendsChatMember.clientPreferences.method2222() != 0 && !Client.playingJingle) { // L: 3613
			Archive var1 = PacketBuffer.archive6; // L: 3614
			int var2 = FriendsChatMember.clientPreferences.method2222(); // L: 3615
			class273.musicPlayerStatus = 1; // L: 3617
			NetFileRequest.musicTrackArchive = var1; // L: 3618
			UrlRequester.musicTrackGroupId = var0; // L: 3619
			SceneTilePaint.musicTrackFileId = 0; // L: 3620
			class28.musicTrackVolume = var2; // L: 3621
			class273.musicTrackBoolean = false; // L: 3622
			class160.pcmSampleLength = 2; // L: 3623
		}

		Client.currentTrackGroupId = var0; // L: 3626
	} // L: 3627
}
