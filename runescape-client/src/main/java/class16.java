import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public abstract class class16 extends Node {
	@ObfuscatedName("m")
	static byte[][][] field132;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	static Archive field134;

	class16() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	abstract void vmethod331(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	abstract void vmethod332(ClanChannel var1);

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2069823141"
	)
	public static int method245(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(ZLns;B)V",
		garbageValue = "58"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field783 = 0;
		Client.field636 = 0;
		class171.method3610();

		int var2;
		NPC var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
			var2 = var1.readBits(15);
			if (var2 == 32767) {
				break;
			}

			boolean var3 = false;
			if (Client.npcs[var2] == null) {
				Client.npcs[var2] = new NPC();
				var3 = true;
			}

			var4 = Client.npcs[var2];
			Client.npcIndices[++Client.npcCount - 1] = var2;
			var4.npcCycle = Client.cycle;
			var4.definition = class248.getNpcDefinition(var1.readBits(14));
			if (var0) {
				var6 = var1.readBits(8);
				if (var6 > 127) {
					var6 -= 256;
				}
			} else {
				var6 = var1.readBits(5);
				if (var6 > 15) {
					var6 -= 32;
				}
			}

			if (var0) {
				var7 = var1.readBits(8);
				if (var7 > 127) {
					var7 -= 256;
				}
			} else {
				var7 = var1.readBits(5);
				if (var7 > 15) {
					var7 -= 32;
				}
			}

			var8 = var1.readBits(1);
			if (var8 == 1) {
				Client.field763[++Client.field636 - 1] = var2;
			}

			var5 = var1.readBits(1);
			boolean var9 = var1.readBits(1) == 1;
			if (var9) {
				var1.readBits(32);
			}

			var10 = Client.defaultRotations[var1.readBits(3)];
			if (var3) {
				var4.orientation = var4.rotation = var10;
			}

			var4.field1225 = var4.definition.size;
			var4.field1275 = var4.definition.rotation;
			if (var4.field1275 == 0) {
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence;
			var4.walkBackSequence = var4.definition.walkBackSequence;
			var4.walkLeftSequence = var4.definition.walkLeftSequence;
			var4.walkRightSequence = var4.definition.walkRightSequence;
			var4.idleSequence = var4.definition.idleSequence;
			var4.turnLeftSequence = var4.definition.turnLeftSequence;
			var4.turnRightSequence = var4.definition.turnRightSequence;
			var4.method2347(class262.localPlayer.pathX[0] + var6, class262.localPlayer.pathY[0] + var7, var5 == 1);
		}

		var1.exportIndex();

		int var14;
		for (var2 = 0; var2 < Client.field636; ++var2) {
			var14 = Client.field763[var2];
			var4 = Client.npcs[var14];
			var5 = var1.readUnsignedByte();
			int var15;
			if ((var5 & 128) != 0) {
				var6 = var1.readUnsignedShort();
				var7 = var1.readUnsignedShort();
				var8 = var4.x - (var6 - class15.baseX * 64 - class15.baseX * 64) * 64;
				var15 = var4.y - (var7 - WorldMapSprite.baseY * 64 - WorldMapSprite.baseY * 64) * 64;
				if (var8 != 0 || var15 != 0) {
					var4.field1280 = (int)(Math.atan2((double)var8, (double)var15) * 325.949D) & 2047;
				}
			}

			if ((var5 & 64) != 0) {
				var4.definition = class248.getNpcDefinition(var1.method6652());
				var4.field1225 = var4.definition.size;
				var4.field1275 = var4.definition.rotation;
				var4.walkSequence = var4.definition.walkSequence;
				var4.walkBackSequence = var4.definition.walkBackSequence;
				var4.walkLeftSequence = var4.definition.walkLeftSequence;
				var4.walkRightSequence = var4.definition.walkRightSequence;
				var4.idleSequence = var4.definition.idleSequence;
				var4.turnLeftSequence = var4.definition.turnLeftSequence;
				var4.turnRightSequence = var4.definition.turnRightSequence;
			}

			if ((var5 & 16) != 0) {
				var6 = var1.readUnsignedShort();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var1.method6642();
				if (var6 == var4.sequence && var6 != -1) {
					var8 = WorldMapScaleHandler.SequenceDefinition_get(var6).field1894;
					if (var8 == 1) {
						var4.sequenceFrame = 0;
						var4.sequenceFrameCycle = 0;
						var4.sequenceDelay = var7;
						var4.field1258 = 0;
					}

					if (var8 == 2) {
						var4.field1258 = 0;
					}
				} else if (var6 == -1 || var4.sequence == -1 || WorldMapScaleHandler.SequenceDefinition_get(var6).field1892 >= WorldMapScaleHandler.SequenceDefinition_get(var4.sequence).field1892) {
					var4.sequence = var6;
					var4.sequenceFrame = 0;
					var4.sequenceFrameCycle = 0;
					var4.sequenceDelay = var7;
					var4.field1258 = 0;
					var4.field1281 = var4.pathLength;
				}
			}

			if ((var5 & 2) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}

			if ((var5 & 1) != 0) {
				var6 = var1.readUnsignedByte();
				int var11;
				int var12;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var15 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var1.readUShortSmart();
						if (var8 == 32767) {
							var8 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							var15 = var1.readUShortSmart();
							var11 = var1.readUShortSmart();
						} else if (var8 != 32766) {
							var10 = var1.readUShortSmart();
						} else {
							var8 = -1;
						}

						var12 = var1.readUShortSmart();
						var4.addHitSplat(var8, var10, var15, var11, Client.cycle, var12);
					}
				}

				var7 = var1.method6643();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var15 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						if (var10 != 32767) {
							var11 = var1.readUShortSmart();
							var12 = var1.method6643();
							int var13 = var10 > 0 ? var1.method6642() : var12;
							var4.addHealthBar(var15, Client.cycle, var10, var11, var12, var13);
						} else {
							var4.removeHealthBar(var15);
						}
					}
				}
			}

			if ((var5 & 32) != 0) {
				var4.field1264 = var1.method6619();
				var4.field1268 = var1.readByte();
				var4.field1265 = var1.readByte();
				var4.field1267 = var1.method6682();
				var4.field1276 = var1.method6651() + Client.cycle;
				var4.field1269 = var1.method6652() + Client.cycle;
				var4.field1270 = var1.method6651();
				var4.pathLength = 1;
				var4.field1281 = 0;
				var4.field1264 += var4.pathX[0];
				var4.field1268 += var4.pathY[0];
				var4.field1265 += var4.pathX[0];
				var4.field1267 += var4.pathY[0];
			}

			if ((var5 & 4) != 0) {
				var4.targetIndex = var1.method6653();
				if (var4.targetIndex == 65535) {
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 8) != 0) {
				var4.spotAnimation = var1.method6651();
				var6 = var1.method6725();
				var4.field1263 = var6 >> 16;
				var4.field1262 = (var6 & 65535) + Client.cycle;
				var4.spotAnimationFrame = 0;
				var4.spotAnimationFrameCycle = 0;
				if (var4.field1262 > Client.cycle) {
					var4.spotAnimationFrame = -1;
				}

				if (var4.spotAnimation == 65535) {
					var4.spotAnimation = -1;
				}
			}
		}

		for (var2 = 0; var2 < Client.field783; ++var2) {
			var14 = Client.field859[var2];
			if (Client.npcs[var14].npcCycle != Client.cycle) {
				Client.npcs[var14].definition = null;
				Client.npcs[var14] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) {
				if (Client.npcs[Client.npcIndices[var2]] == null) {
					throw new RuntimeException(var2 + "," + Client.npcCount);
				}
			}

		}
	}
}
