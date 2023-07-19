import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	AbstractArchive field313;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	NodeHashTable field315;

	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field315 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field313 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbe;",
		garbageValue = "294940655"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method865(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field315.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1099();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field315.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcg;",
		garbageValue = "51"
	)
	class53 method866(int var1, int var2) {
		long var3 = this.method865(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field315.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field313, var1, var2); // L: 40
			if (var6 == null) { // L: 41
				return new class53(); // L: 42
			} else {
				class53 var7 = new class53(var6); // L: 44
				this.field315.put(var7, var3); // L: 45
				return var7; // L: 46
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbe;",
		garbageValue = "-1816689630"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 50
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 51
		} else {
			throw new RuntimeException(); // L: 52
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lcg;",
		garbageValue = "-1808138813"
	)
	public class53 method863(int var1) {
		if (this.field313.getGroupCount() == 1) { // L: 56
			return this.method866(0, var1); // L: 57
		} else if (this.field313.getGroupFileCount(var1) == 1) { // L: 59
			return this.method866(var1, 0); // L: 60
		} else {
			throw new RuntimeException(); // L: 63
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lbe;",
		garbageValue = "-571087406"
	)
	public RawSound method878(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 68
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "22837451"
	)
	long method865(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 72
		var4 |= var1 << 16; // L: 73
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 74 75 78
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "111"
	)
	static int method879(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1001
			var0 -= 1000; // L: 1002
			var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1003
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1005
		}

		class303.invalidateWidget(var3); // L: 1006
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1007
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1027
				var3.modelType = 2; // L: 1028
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1029
				return 1; // L: 1030
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1032
				var3.modelType = 3; // L: 1033
				var3.modelId = class27.localPlayer.appearance.getChatHeadId(); // L: 1034
				return 1; // L: 1035
			} else if (var0 == 1207) { // L: 1037
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1038
				class145.method3223(var3, class27.localPlayer.appearance, var7); // L: 1039
				return 1; // L: 1040
			} else if (var0 == 1208) { // L: 1042
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1043
				if (var3.field3685 == null) { // L: 1044
					throw new RuntimeException(""); // L: 1045
				} else {
					class168.method3465(var3, var4); // L: 1047
					return 1; // L: 1048
				}
			} else if (var0 == 1209) { // L: 1050
				Interpreter.Interpreter_intStackSize -= 2; // L: 1051
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1052
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1053
				if (var3.field3685 == null) { // L: 1054
					throw new RuntimeException(""); // L: 1055
				} else {
					WorldMapSectionType.method5510(var3, var4, var5); // L: 1057
					return 1; // L: 1058
				}
			} else if (var0 == 1210) { // L: 1060
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1061
				if (var3.field3685 == null) { // L: 1062
					throw new RuntimeException(""); // L: 1063
				} else {
					class159.method3384(var3, class27.localPlayer.appearance.field3563, var4); // L: 1065
					return 1; // L: 1066
				}
			} else {
				return 2; // L: 1068
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1008
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1009
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1010
			var3.itemId = var4; // L: 1011
			var3.itemQuantity = var5; // L: 1012
			ItemComposition var6 = class141.ItemComposition_get(var4); // L: 1013
			var3.modelAngleX = var6.xan2d; // L: 1014
			var3.modelAngleY = var6.yan2d; // L: 1015
			var3.modelAngleZ = var6.zan2d; // L: 1016
			var3.modelOffsetX = var6.offsetX2d; // L: 1017
			var3.modelOffsetY = var6.offsetY2d; // L: 1018
			var3.modelZoom = var6.zoom2d; // L: 1019
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1020
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1021
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1022
			}

			if (var3.field3700 > 0) { // L: 1023
				var3.modelZoom = var3.modelZoom * 32 / var3.field3700;
			} else if (var3.rawWidth > 0) { // L: 1024
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1025
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-340230220"
	)
	static final void method872(Actor var0) {
		int var2;
		int var3;
		int var4;
		int var6;
		if (var0.targetIndex != -1) { // L: 4460
			Object var1 = null; // L: 4461
			var2 = 65536; // L: 4462
			if (var0.targetIndex < var2) { // L: 4463
				var1 = Client.npcs[var0.targetIndex]; // L: 4464
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4467
			}

			if (var1 != null) { // L: 4469
				var3 = var0.x - ((Actor)var1).x; // L: 4470
				var4 = var0.y - ((Actor)var1).y; // L: 4471
				if (var3 != 0 || var4 != 0) { // L: 4472
					var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047; // L: 4476
					var0.orientation = var6; // L: 4478
				}
			} else if (var0.false0) { // L: 4481
				var0.targetIndex = -1; // L: 4482
				var0.false0 = false; // L: 4483
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1251 > 0) { // L: 4486
			var7 = -1; // L: 4487
			if (var0.field1215 != -1 && var0.field1216 != -1) { // L: 4488
				var2 = var0.field1215 * 128 - class166.baseX * 8192 + 64; // L: 4489
				var3 = var0.field1216 * 128 - class9.baseY * 8192 + 64; // L: 4490
				var4 = var0.x - var2; // L: 4491
				int var8 = var0.y - var3; // L: 4492
				if (var4 != 0 || var8 != 0) { // L: 4493
					var6 = (int)(Math.atan2((double)var4, (double)var8) * 325.94932345220167D) & 2047; // L: 4496
					var7 = var6; // L: 4498
				}
			} else if (var0.field1218 != -1) { // L: 4501
				var7 = var0.field1218; // L: 4502
			}

			if (var7 != -1) { // L: 4504
				var0.orientation = var7; // L: 4505
				if (var0.field1217) { // L: 4506
					var0.rotation = var0.orientation; // L: 4507
				}
			}

			var0.method2424(); // L: 4510
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4512
		if (var7 != 0) { // L: 4513
			boolean var10 = true; // L: 4514
			boolean var11 = true; // L: 4515
			++var0.field1246; // L: 4516
			var4 = var7 > 1024 ? -1 : 1; // L: 4517
			var0.rotation += var0.field1228 * var4; // L: 4518
			boolean var12 = true; // L: 4519
			if (var7 < var0.field1228 || var7 > 2048 - var0.field1228) { // L: 4520
				var0.rotation = var0.orientation; // L: 4521
				var12 = false; // L: 4522
			}

			if (var0.field1228 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1246 > 25 || var12)) { // L: 4524
				if (var4 == -1 && var0.field1184 != -1) { // L: 4525
					var0.movementSequence = var0.field1184; // L: 4526
				} else if (var4 == 1 && var0.field1185 != -1) { // L: 4528
					var0.movementSequence = var0.field1185; // L: 4529
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4532
				}
			}

			var0.rotation &= 2047; // L: 4536
		} else {
			if (var0.false0) { // L: 4539
				var0.targetIndex = -1; // L: 4540
				var0.false0 = false; // L: 4541
			}

			var0.field1246 = 0; // L: 4543
		}

	} // L: 4545

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ldh;III)V",
		garbageValue = "867120909"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4555
			int var3 = class140.SequenceDefinition_get(var1).field2301; // L: 4556
			if (var3 == 1) { // L: 4557
				var0.sequenceFrame = 0; // L: 4558
				var0.sequenceFrameCycle = 0; // L: 4559
				var0.sequenceDelay = var2; // L: 4560
				var0.field1226 = 0; // L: 4561
			}

			if (var3 == 2) { // L: 4563
				var0.field1226 = 0; // L: 4564
			}
		} else if (var1 == -1 || var0.sequence == -1 || class140.SequenceDefinition_get(var1).field2294 >= class140.SequenceDefinition_get(var0.sequence).field2294) { // L: 4567
			var0.sequence = var1; // L: 4568
			var0.sequenceFrame = 0; // L: 4569
			var0.sequenceFrameCycle = 0; // L: 4570
			var0.sequenceDelay = var2; // L: 4571
			var0.field1226 = 0; // L: 4572
			var0.field1252 = var0.pathLength; // L: 4573
		}

	} // L: 4575

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "929085287"
	)
	static final void method880() {
		PacketBufferNode var0 = class217.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 12348
		Client.packetWriter.addNode(var0); // L: 12349
		Interpreter.field865 = true; // L: 12350

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12351
			if (var1.type == 0 || var1.type == 3) { // L: 12352
				class260.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12354
			class303.invalidateWidget(Client.meslayerContinueWidget); // L: 12355
			Client.meslayerContinueWidget = null; // L: 12356
		}

		Interpreter.field865 = false; // L: 12358
	} // L: 12359

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "91"
	)
	public static Clipboard method861() {
		return class415.client.method608(); // L: 12874
	}
}
