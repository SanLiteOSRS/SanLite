import java.awt.Component;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lf;Lf;B)I",
		garbageValue = "0"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-1389394211"
	)
	static void method242(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lky;I)V",
		garbageValue = "1274576828"
	)
	static final void method234(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
			int var2 = Players.Players_pendingUpdateIndices[var1];
			Player var3 = Client.players[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 128) != 0) {
				var4 += var0.readUnsignedByte() << 8;
			}

			byte var5 = -1;
			if ((var4 & 2048) != 0) {
				var3.field997 = var0.readByte();
				var3.field1016 = var0.method5730();
				var3.field1015 = var0.readByte();
				var3.field1017 = var0.readByte();
				var3.field1026 = var0.method5657() + Client.cycle;
				var3.field1019 = var0.method5655() + Client.cycle;
				var3.field1027 = var0.method5656();
				if (var3.field660) {
					var3.field997 += var3.tileX;
					var3.field1016 += var3.tileY;
					var3.field1015 += var3.tileX;
					var3.field1017 += var3.tileY;
					var3.pathLength = 0;
				} else {
					var3.field997 += var3.pathX[0];
					var3.field1016 += var3.pathY[0];
					var3.field1015 += var3.pathX[0];
					var3.field1017 += var3.pathY[0];
					var3.pathLength = 1;
				}

				var3.field973 = 0;
			}

			int var6;
			int var7;
			if ((var4 & 4) != 0) {
				var6 = var0.method5656();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var0.readUnsignedByte();
				GrandExchangeOfferNameComparator.performPlayerAnimation(var3, var6, var7);
			}

			if ((var4 & 4096) != 0) {
				var5 = var0.method5649();
			}

			int var9;
			int var10;
			int var13;
			if ((var4 & 64) != 0) {
				var6 = var0.method5656();
				PlayerType var14 = (PlayerType)TextureProvider.findEnumerated(ApproximateRouteStrategy.PlayerType_values(), var0.method5639());
				boolean var8 = var0.method5612() == 1;
				var9 = var0.method5639();
				var10 = var0.offset;
				if (var3.username != null && var3.appearance != null) {
					boolean var11 = false;
					if (var14.isUser && class60.friendSystem.isIgnored(var3.username)) {
						var11 = true;
					}

					if (!var11 && Client.field790 == 0 && !var3.isHidden) {
						Players.field1287.offset = 0;
						var0.method5697(Players.field1287.array, 0, var9);
						Players.field1287.offset = 0;
						String var12 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(Players.field1287)));
						var3.overheadText = var12.trim();
						var3.overheadTextColor = var6 >> 8;
						var3.overheadTextEffect = var6 & 255;
						var3.overheadTextCyclesRemaining = 150;
						var3.isAutoChatting = var8;
						var3.field986 = var3 != WorldMapLabelSize.localPlayer && var14.isUser && "" != Client.field913 && var12.toLowerCase().indexOf(Client.field913) == -1;
						if (var14.isPrivileged) {
							var13 = var8 ? 91 : 1;
						} else {
							var13 = var8 ? 90 : 2;
						}

						if (var14.modIcon != -1) {
							WorldMapRectangle.addGameMessage(var13, WorldMapScaleHandler.method824(var14.modIcon) + var3.username.getName(), var12);
						} else {
							WorldMapRectangle.addGameMessage(var13, var3.username.getName(), var12);
						}
					}
				}

				var0.offset = var10 + var9;
			}

			if ((var4 & 512) != 0) {
				Players.field1284[var2] = var0.readByte();
			}

			if ((var4 & 16) != 0) {
				var6 = var0.method5612();
				int var15;
				int var17;
				int var19;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var10 = -1;
						var19 = -1;
						var17 = var0.readUShortSmart();
						if (var17 == 32767) {
							var17 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var19 = var0.readUShortSmart();
						} else if (var17 != 32766) {
							var10 = var0.readUShortSmart();
						} else {
							var17 = -1;
						}

						var15 = var0.readUShortSmart();
						var3.addHitSplat(var17, var10, var9, var19, Client.cycle, var15);
					}
				}

				var7 = var0.method5646();
				if (var7 > 0) {
					for (var17 = 0; var17 < var7; ++var17) {
						var9 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
						if (var10 != 32767) {
							var19 = var0.readUShortSmart();
							var15 = var0.readUnsignedByte();
							var13 = var10 > 0 ? var0.method5646() : var15;
							var3.addHealthBar(var9, Client.cycle, var10, var19, var15, var13);
						} else {
							var3.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var4 & 1024) != 0) {
				var3.spotAnimation = var0.readUnsignedShort();
				var6 = var0.method5667();
				var3.field1003 = var6 >> 16;
				var3.field1013 = (var6 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1013 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 32) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				if (var3.overheadText.charAt(0) == '~') {
					var3.overheadText = var3.overheadText.substring(1);
					WorldMapRectangle.addGameMessage(2, var3.username.getName(), var3.overheadText);
				} else if (var3 == WorldMapLabelSize.localPlayer) {
					WorldMapRectangle.addGameMessage(2, var3.username.getName(), var3.overheadText);
				}

				var3.isAutoChatting = false;
				var3.overheadTextColor = 0;
				var3.overheadTextEffect = 0;
				var3.overheadTextCyclesRemaining = 150;
			}

			if ((var4 & 1) != 0) {
				var6 = var0.method5639();
				byte[] var20 = new byte[var6];
				Buffer var16 = new Buffer(var20);
				var0.method5749(var20, 0, var6);
				Players.field1277[var2] = var16;
				var3.read(var16);
			}

			if ((var4 & 8) != 0) {
				var3.targetIndex = var0.method5657();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 2) != 0) {
				var3.field1000 = var0.method5655();
				if (var3.pathLength == 0) {
					var3.orientation = var3.field1000;
					var3.field1000 = -1;
				}
			}

			if ((var4 & 256) != 0) {
				for (var6 = 0; var6 < 3; ++var6) {
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if (var3.field660) {
				if (var5 == 127) {
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					byte var18;
					if (var5 != -1) {
						var18 = var5;
					} else {
						var18 = Players.field1284[var2];
					}

					var3.method1286(var3.tileX, var3.tileY, var18);
				}
			}
		}

	}
}
