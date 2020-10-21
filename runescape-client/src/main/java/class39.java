import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class39 {
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		signature = "Llb;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lag;"
	)
	static final class39 field287;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lag;"
	)
	static final class39 field285;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -235911215
	)
	@Export("value")
	final int value;

	static {
		field287 = new class39(0);
		field285 = new class39(1);
	}

	class39(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BB)Llc;",
		garbageValue = "0"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var3 * var2];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lks;IS)V",
		garbageValue = "-7425"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		GrandExchangeEvent.method172(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 16) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			byte var7 = -1;
			int var8;
			if ((var6 & 2048) != 0) {
				for (var8 = 0; var8 < 3; ++var8) {
					var5.actions[var8] = var0.readStringCp1252NullTerminated();
				}
			}

			int var9;
			if ((var6 & 2) != 0) {
				var8 = var0.readUnsignedShort();
				if (var8 == 65535) {
					var8 = -1;
				}

				var9 = var0.method5668();
				Varps.performPlayerAnimation(var5, var8, var9);
			}

			if ((var6 & 256) != 0) {
				var7 = var0.method5669();
			}

			int var11;
			int var12;
			int var15;
			if ((var6 & 8) != 0) {
				var8 = var0.method5659();
				PlayerType var16 = (PlayerType)class195.findEnumerated(WorldMapLabelSize.PlayerType_values(), var0.method5619());
				boolean var10 = var0.readUnsignedByte() == 1;
				var11 = var0.method5668();
				var12 = var0.offset;
				if (var5.username != null && var5.appearance != null) {
					boolean var13 = false;
					if (var16.isUser && WorldMapLabelSize.friendSystem.isIgnored(var5.username)) {
						var13 = true;
					}

					if (!var13 && Client.field795 == 0 && !var5.isHidden) {
						Players.field1280.offset = 0;
						var0.method5833(Players.field1280.array, 0, var11);
						Players.field1280.offset = 0;
						String var14 = AbstractFont.escapeBrackets(WorldMapSection0.method328(Tile.method3004(Players.field1280)));
						var5.overheadText = var14.trim();
						var5.field992 = var8 >> 8;
						var5.field993 = var8 & 255;
						var5.overheadTextCyclesRemaining = 150;
						var5.isAutoChatting = var10;
						var5.field974 = var5 != PlayerType.localPlayer && var16.isUser && "" != Client.field710 && var14.toLowerCase().indexOf(Client.field710) == -1;
						if (var16.isPrivileged) {
							var15 = var10 ? 91 : 1;
						} else {
							var15 = var10 ? 90 : 2;
						}

						if (var16.modIcon != -1) {
							DevicePcmPlayerProvider.addGameMessage(var15, PrivateChatMode.method6034(var16.modIcon) + var5.username.getName(), var14);
						} else {
							DevicePcmPlayerProvider.addGameMessage(var15, var5.username.getName(), var14);
						}
					}
				}

				var0.offset = var12 + var11;
			}

			if ((var6 & 32) != 0) {
				var5.field1003 = var0.method5675();
				if (var5.pathLength == 0) {
					var5.orientation = var5.field1003;
					var5.field1003 = -1;
				}
			}

			if ((var6 & 128) != 0) {
				var5.overheadText = var0.readStringCp1252NullTerminated();
				if (var5.overheadText.charAt(0) == '~') {
					var5.overheadText = var5.overheadText.substring(1);
					DevicePcmPlayerProvider.addGameMessage(2, var5.username.getName(), var5.overheadText);
				} else if (var5 == PlayerType.localPlayer) {
					DevicePcmPlayerProvider.addGameMessage(2, var5.username.getName(), var5.overheadText);
				}

				var5.isAutoChatting = false;
				var5.field992 = 0;
				var5.field993 = 0;
				var5.overheadTextCyclesRemaining = 150;
			}

			if ((var6 & 4096) != 0) {
				var5.spotAnimation = var0.readUnsignedShort();
				var8 = var0.method5685();
				var5.field1016 = var8 >> 16;
				var5.field1015 = (var8 & 65535) + Client.cycle;
				var5.spotAnimationFrame = 0;
				var5.spotAnimationFrameCycle = 0;
				if (var5.field1015 > Client.cycle) {
					var5.spotAnimationFrame = -1;
				}

				if (var5.spotAnimation == 65535) {
					var5.spotAnimation = -1;
				}
			}

			if ((var6 & 64) != 0) {
				var5.targetIndex = var0.method5675();
				if (var5.targetIndex == 65535) {
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 4) != 0) {
				var8 = var0.method5650();
				byte[] var22 = new byte[var8];
				Buffer var17 = new Buffer(var22);
				var0.method5689(var22, 0, var8);
				Players.field1284[var4] = var17;
				var5.read(var17);
			}

			if ((var6 & 1) != 0) {
				var8 = var0.readUnsignedByte();
				int var18;
				int var19;
				int var21;
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var11 = -1;
						var12 = -1;
						var21 = -1;
						var19 = var0.readUShortSmart();
						if (var19 == 32767) {
							var19 = var0.readUShortSmart();
							var12 = var0.readUShortSmart();
							var11 = var0.readUShortSmart();
							var21 = var0.readUShortSmart();
						} else if (var19 != 32766) {
							var12 = var0.readUShortSmart();
						} else {
							var19 = -1;
						}

						var18 = var0.readUShortSmart();
						var5.addHitSplat(var19, var12, var11, var21, Client.cycle, var18);
					}
				}

				var9 = var0.method5668();
				if (var9 > 0) {
					for (var19 = 0; var19 < var9; ++var19) {
						var11 = var0.readUShortSmart();
						var12 = var0.readUShortSmart();
						if (var12 != 32767) {
							var21 = var0.readUShortSmart();
							var18 = var0.method5668();
							var15 = var12 > 0 ? var0.readUnsignedByte() : var18;
							var5.addHealthBar(var11, Client.cycle, var12, var21, var18, var15);
						} else {
							var5.removeHealthBar(var11);
						}
					}
				}
			}

			if ((var6 & 1024) != 0) {
				var5.field1017 = var0.method5837();
				var5.field1019 = var0.readByte();
				var5.field1018 = var0.method5837();
				var5.field1020 = var0.method5837();
				var5.field1009 = var0.method5659() + Client.cycle;
				var5.field1024 = var0.method5797() + Client.cycle;
				var5.field1023 = var0.method5659();
				if (var5.field664) {
					var5.field1017 += var5.tileX;
					var5.field1019 += var5.tileY;
					var5.field1018 += var5.tileX;
					var5.field1020 += var5.tileY;
					var5.pathLength = 0;
				} else {
					var5.field1017 += var5.pathX[0];
					var5.field1019 += var5.pathY[0];
					var5.field1018 += var5.pathX[0];
					var5.field1020 += var5.pathY[0];
					var5.pathLength = 1;
				}

				var5.field1034 = 0;
			}

			if ((var6 & 512) != 0) {
				Players.field1295[var4] = var0.method5669();
			}

			if (var5.field664) {
				if (var7 == 127) {
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					byte var20;
					if (var7 != -1) {
						var20 = var7;
					} else {
						var20 = Players.field1295[var4];
					}

					var5.method1335(var5.tileX, var5.tileY, var20);
				}
			}
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}
}
