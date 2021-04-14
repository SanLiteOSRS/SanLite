import java.awt.Component;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		signature = "Lmr;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Llg;Llg;I)I",
		garbageValue = "-867581222"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-1533461235"
	)
	static void method2419(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1612766571"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class208.sortWorlds(class9.World_worlds, 0, class9.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-303804195"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		signature = "(ZLnk;ZI)V",
		garbageValue = "517232593"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1, boolean var2) {
		Client.field723 = 0;
		Client.field645 = 0;
		Strings.method4404();
		WorldMapScaleHandler.method3246(var0, var1, var2);

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.field645; ++var3) {
			var4 = Client.field646[var3];
			NPC var5 = Client.npcs[var4];
			int var6 = var1.readUnsignedByte();
			int var7;
			if ((var6 & 128) != 0) {
				var5.spotAnimation = var1.readUnsignedShort();
				var7 = var1.method6629();
				var5.field1238 = var7 >> 16;
				var5.field1249 = (var7 & 65535) + Client.cycle;
				var5.spotAnimationFrame = 0;
				var5.spotAnimationFrameCycle = 0;
				if (var5.field1249 > Client.cycle) {
					var5.spotAnimationFrame = -1;
				}

				if (var5.spotAnimation == 65535) {
					var5.spotAnimation = -1;
				}
			}

			int var8;
			int var9;
			int var10;
			if ((var6 & 64) != 0) {
				var7 = var1.method6748();
				var8 = var1.method6766();
				var9 = var5.x - (var7 - ItemLayer.baseX * 64 - ItemLayer.baseX * 64) * 64;
				var10 = var5.y - (var8 - Tile.baseY * 64 - Tile.baseY * 64) * 64;
				if (var9 != 0 || var10 != 0) {
					var5.field1237 = (int)(Math.atan2((double)var9, (double)var10) * 325.949D) & 2047;
				}
			}

			if ((var6 & 1) != 0) {
				var5.overheadText = var1.readStringCp1252NullTerminated();
				var5.overheadTextCyclesRemaining = 100;
			}

			if ((var6 & 16) != 0) {
				var5.definition = GraphicsObject.getNpcDefinition(var1.method6766());
				var5.field1258 = var5.definition.size;
				var5.field1262 = var5.definition.field3503;
				var5.walkSequence = var5.definition.walkSequence;
				var5.walkBackSequence = var5.definition.walkBackSequence;
				var5.walkLeftSequence = var5.definition.walkLeftSequence;
				var5.walkRightSequence = var5.definition.walkRightSequence;
				var5.readySequence = var5.definition.readySequence;
				var5.turnLeftSequence = var5.definition.turnLeftSequence;
				var5.turnRightSequence = var5.definition.turnRightSequence;
			}

			if ((var6 & 8) != 0) {
				var5.targetIndex = var1.readUnsignedShort();
				if (var5.targetIndex == 65535) {
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 4) != 0) {
				var7 = var1.readUnsignedByte();
				int var11;
				int var12;
				int var13;
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var10 = -1;
						var11 = -1;
						var12 = -1;
						var9 = var1.readUShortSmart();
						if (var9 == 32767) {
							var9 = var1.readUShortSmart();
							var11 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							var12 = var1.readUShortSmart();
						} else if (var9 != 32766) {
							var11 = var1.readUShortSmart();
						} else {
							var9 = -1;
						}

						var13 = var1.readUShortSmart();
						var5.addHitSplat(var9, var11, var10, var12, Client.cycle, var13);
					}
				}

				var8 = var1.method6623();
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
						if (var11 != 32767) {
							var12 = var1.readUShortSmart();
							var13 = var1.method6623();
							int var14 = var11 > 0 ? var1.method6609() : var13;
							var5.addHealthBar(var10, Client.cycle, var11, var12, var13, var14);
						} else {
							var5.removeHealthBar(var10);
						}
					}
				}
			}

			if ((var6 & 2) != 0) {
				var5.field1240 = var1.method6612();
				var5.field1253 = var1.method6584();
				var5.field1252 = var1.method6612();
				var5.field1239 = var1.readByte();
				var5.field1255 = var1.method6748() + Client.cycle;
				var5.field1268 = var1.method6766() + Client.cycle;
				var5.field1213 = var1.method6748();
				var5.pathLength = 1;
				var5.field1224 = 0;
				var5.field1240 += var5.pathX[0];
				var5.field1253 += var5.pathY[0];
				var5.field1252 += var5.pathX[0];
				var5.field1239 += var5.pathY[0];
			}

			if ((var6 & 32) != 0) {
				var7 = var1.method6617();
				if (var7 == 65535) {
					var7 = -1;
				}

				var8 = var1.method6610();
				if (var7 == var5.sequence && var7 != -1) {
					var9 = class225.SequenceDefinition_get(var7).field3707;
					if (var9 == 1) {
						var5.sequenceFrame = 0;
						var5.sequenceFrameCycle = 0;
						var5.sequenceDelay = var8;
						var5.field1245 = 0;
					}

					if (var9 == 2) {
						var5.field1245 = 0;
					}
				} else if (var7 == -1 || var5.sequence == -1 || class225.SequenceDefinition_get(var7).field3718 >= class225.SequenceDefinition_get(var5.sequence).field3718) {
					var5.sequence = var7;
					var5.sequenceFrame = 0;
					var5.sequenceFrameCycle = 0;
					var5.sequenceDelay = var8;
					var5.field1245 = 0;
					var5.field1224 = var5.pathLength;
				}
			}
		}

		for (var3 = 0; var3 < Client.field723; ++var3) {
			var4 = Client.field724[var3];
			if (Client.npcs[var4].field1220 != Client.cycle) {
				Client.npcs[var4].definition = null;
				Client.npcs[var4] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var3 = 0; var3 < Client.npcCount; ++var3) {
				if (Client.npcs[Client.npcIndices[var3]] == null) {
					throw new RuntimeException(var3 + "," + Client.npcCount);
				}
			}

		}
	}
}
