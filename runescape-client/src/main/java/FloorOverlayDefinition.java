import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1313207677
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1768544221
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("i")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1964387519
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1954941483
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -935699783
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1596036719
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 45293449
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1367236851
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1186195215
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1294557825"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;II)V",
		garbageValue = "-1509952388"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkf;III)V",
		garbageValue = "211427426"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "304322495"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(var14 * 256.0D);
		this.lightness = (int)(var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1598465666"
	)
	public static int method4871(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		signature = "(ZLky;I)V",
		garbageValue = "2034094426"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field771 = 0;
		Client.field702 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field930[++Client.field771 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = Client.npcIndices[var4];
				NPC var6 = Client.npcs[var5];
				int var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var6.npcCycle = Client.cycle;
				} else {
					int var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var6.npcCycle = Client.cycle;
						Client.field721[++Client.field702 - 1] = var5;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var6.method2115(var9, (byte)1);
							var10 = var2.readBits(1);
							if (var10 == 1) {
								Client.field721[++Client.field702 - 1] = var5;
							}
						} else if (var8 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var5;
							var6.npcCycle = Client.cycle;
							var9 = var2.readBits(3);
							var6.method2115(var9, (byte)2);
							var10 = var2.readBits(3);
							var6.method2115(var10, (byte)2);
							int var11 = var2.readBits(1);
							if (var11 == 1) {
								Client.field721[++Client.field702 - 1] = var5;
							}
						} else if (var8 == 3) {
							Client.field930[++Client.field771 - 1] = var5;
						}
					}
				}
			}

			method4879(var0, var1);
			Archive.method4357(var1);

			int var12;
			for (var12 = 0; var12 < Client.field771; ++var12) {
				var3 = Client.field930[var12];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var12 = 0; var12 < Client.npcCount; ++var12) {
					if (Client.npcs[Client.npcIndices[var12]] == null) {
						throw new RuntimeException(var12 + "," + Client.npcCount);
					}
				}

			}
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		signature = "(ZLky;B)V",
		garbageValue = "46"
	)
	static final void method4879(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				int var2 = var1.readBits(15);
				if (var2 != 32767) {
					boolean var3 = false;
					if (Client.npcs[var2] == null) {
						Client.npcs[var2] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.npcs[var2];
					Client.npcIndices[++Client.npcCount - 1] = var2;
					var4.npcCycle = Client.cycle;
					int var5 = var1.readBits(1);
					if (var5 == 1) {
						Client.field721[++Client.field702 - 1] = var2;
					}

					int var6;
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

					int var7 = var1.readBits(1);
					var4.definition = Skeleton.getNpcDefinition(var1.readBits(14));
					int var8 = Client.defaultRotations[var1.readBits(3)];
					if (var3) {
						var4.orientation = var4.rotation = var8;
					}

					int var9;
					if (var0) {
						var9 = var1.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					var4.field1014 = var4.definition.size;
					var4.field1025 = var4.definition.rotation;
					if (var4.field1025 == 0) {
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence;
					var4.walkBackSequence = var4.definition.walkBackSequence;
					var4.walkLeftSequence = var4.definition.walkLeftSequence;
					var4.walkRightSequence = var4.definition.walkRightSequence;
					var4.readySequence = var4.definition.readySequence;
					var4.turnLeftSequence = var4.definition.turnLeftSequence;
					var4.turnRightSequence = var4.definition.turnRightSequence;
					var4.method2121(WorldMapLabelSize.localPlayer.pathX[0] + var9, WorldMapLabelSize.localPlayer.pathY[0] + var6, var7 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}
}
