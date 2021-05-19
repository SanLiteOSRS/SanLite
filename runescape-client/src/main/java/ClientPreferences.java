import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -589693927
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("o")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("g")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 706113995
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("z")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("t")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("v")
	double field1303;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1983540285
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1893161511
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 51671271
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("x")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1303 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method2233(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1303 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.field1303 = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
			} else {
				this.method2233(true);
			}
		} else {
			this.method2233(true);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1649794389"
	)
	void method2233(boolean var1) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lnk;",
		garbageValue = "0"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(this.field1303 * 100.0D));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		return var1;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(ZLnm;I)V",
		garbageValue = "530803334"
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
			var2 = var1.method6648();
			var3 = var1.method6620();
			int var4 = var1.readUnsignedShort();
			FriendsList.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					FriendsList.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			HealthBar.regions = new int[var4];
			class264.regionMapArchiveIds = new int[var4];
			class15.regionLandArchiveIds = new int[var4];
			Messages.regionLandArchives = new byte[var4][];
			class159.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
				var16 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						HealthBar.regions[var4] = var8;
						class264.regionMapArchiveIds[var4] = WorldMapSection0.archive7.getGroupId("m" + var6 + "_" + var7);
						class15.regionLandArchiveIds[var4] = WorldMapSection0.archive7.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			Actor.method2199(var3, var2, true);
		} else {
			var2 = var1.readUnsignedShort();
			var3 = var1.method6620();
			boolean var15 = var1.method6478() == 1;
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
			FriendsList.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					FriendsList.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			HealthBar.regions = new int[var5];
			class264.regionMapArchiveIds = new int[var5];
			class15.regionLandArchiveIds = new int[var5];
			Messages.regionLandArchives = new byte[var5][];
			class159.regionMapArchives = new byte[var5][];
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
								if (HealthBar.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								HealthBar.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class264.regionMapArchiveIds[var5] = WorldMapSection0.archive7.getGroupId("m" + var13 + "_" + var14);
								class15.regionLandArchiveIds[var5] = WorldMapSection0.archive7.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			Actor.method2199(var3, var2, !var15);
		}

	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "2116886515"
	)
	public static void method2239(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher);
		var4.packetBuffer.method6484(var1);
		var4.packetBuffer.writeInt(var3 ? Client.field839 : 0);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.method6483(var0);
		Client.packetWriter.addNode(var4);
	}
}
