import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("i")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfl;",
		garbageValue = "80"
	)
	public static HitSplatDefinition method372(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ZLoj;I)V",
		garbageValue = "-1681354127"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.method7120();
			var3 = var1.method7004();
			int var4 = var1.readUnsignedShort();
			Client.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					Client.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			LoginScreenAnimation.regions = new int[var4];
			class119.regionMapArchiveIds = new int[var4];
			class21.regionLandArchiveIds = new int[var4];
			ModeWhere.regionLandArchives = new byte[var4][];
			class184.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if (Client.field619) {
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) {
					var16 = true;
				}
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						LoginScreenAnimation.regions[var4] = var8;
						class119.regionMapArchiveIds[var4] = class11.archive5.getGroupId("m" + var6 + "_" + var7);
						class21.regionLandArchiveIds[var4] = class11.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			EnumComposition.method3107(var3, var2, true);
		} else {
			var2 = var1.method7120();
			var3 = var1.readUnsignedShort();
			boolean var15 = var1.readUnsignedByte() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			Client.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Client.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			LoginScreenAnimation.regions = new int[var5];
			class119.regionMapArchiveIds = new int[var5];
			class21.regionLandArchiveIds = new int[var5];
			ModeWhere.regionLandArchives = new byte[var5][];
			class184.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (LoginScreenAnimation.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								LoginScreenAnimation.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class119.regionMapArchiveIds[var5] = class11.archive5.getGroupId("m" + var13 + "_" + var14);
								class21.regionLandArchiveIds[var5] = class11.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			EnumComposition.method3107(var2, var3, !var15);
		}

	}
}
