import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ay")
	boolean field1764;
	@ObfuscatedName("an")
	boolean field1763;
	@ObfuscatedName("ar")
	@Export("members")
	public List members;
	@ObfuscatedName("ab")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 2111138327736234637L
	)
	long field1765;
	@ObfuscatedName("ax")
	@Export("name")
	public String name;
	@ObfuscatedName("al")
	public byte field1762;
	@ObfuscatedName("aj")
	public byte field1768;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Ltc;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1763 = true; // L: 13
		this.name = null; // L: 17
		this.method3318(var1); // L: 26
	} // L: 27

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-16"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9600(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			class260.method5397(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfd;I)V",
		garbageValue = "-666243871"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1403302036"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2094199771"
	)
	public int method3316() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "837431806"
	)
	public int method3317(String var1) {
		if (!this.field1763) { // L: 60
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 61
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 62
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "1661581722"
	)
	void method3318(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1764 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1763 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1765 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1768 = var1.readByte();
		this.field1762 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1764) {
					var1.readLong(); // L: 85
				}

				if (this.field1763) { // L: 87
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 88
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) { // L: 90
					var1.readBoolean(); // L: 91
				}

				this.members.add(var5, var6); // L: 94
			}
		}

	} // L: 97

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILni;IIIZI)V",
		garbageValue = "244487675"
	)
	public static void method3327(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class304.musicPlayerStatus = 1; // L: 77
		HealthBar.musicTrackArchive = var1; // L: 78
		class7.musicTrackGroupId = var2; // L: 79
		class438.musicTrackFileId = var3; // L: 80
		class178.musicTrackVolume = var4; // L: 81
		class404.musicTrackBoolean = var5; // L: 82
		class128.pcmSampleLength = var0; // L: 83
	} // L: 84

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Llg;B)V",
		garbageValue = "-117"
	)
	static final void method3322(class294 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7933
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		if (class294.field3208 == var0) { // L: 7934
			var2 = var1.method9006(); // L: 7935
			var3 = var1.method9026(); // L: 7936
			var4 = (var3 >> 4 & 7) + InvDefinition.field1908; // L: 7937
			var5 = (var3 & 7) + class124.field1461; // L: 7938
			var6 = var1.method9050(); // L: 7939
			var7 = var6 >> 2; // L: 7940
			var8 = var6 & 3; // L: 7941
			var9 = Client.field717[var7]; // L: 7942
			if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) { // L: 7943
				if (var9 == 0) { // L: 7944
					WallObject var35 = UserComparator4.scene.method4540(NetFileRequest.Client_plane, var4, var5); // L: 7945
					if (var35 != null) { // L: 7946
						var11 = class299.Entity_unpackID(var35.tag); // L: 7947
						if (var7 == 2) { // L: 7948
							var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, NetFileRequest.Client_plane, var4, var5, var2, false, var35.renderable1); // L: 7949
							var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, NetFileRequest.Client_plane, var4, var5, var2, false, var35.renderable2); // L: 7950
						} else {
							var35.renderable1 = new DynamicObject(var11, var7, var8, NetFileRequest.Client_plane, var4, var5, var2, false, var35.renderable1); // L: 7952
						}

						return; // L: 7953
					}
				}

				if (var9 == 1) { // L: 7956
					DecorativeObject var43 = UserComparator4.scene.method4603(NetFileRequest.Client_plane, var4, var5); // L: 7957
					if (var43 != null) { // L: 7958
						var11 = class299.Entity_unpackID(var43.tag); // L: 7959
						if (var7 != 4 && var7 != 5) { // L: 7960
							if (var7 == 6) { // L: 7961
								var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, NetFileRequest.Client_plane, var4, var5, var2, false, var43.renderable1);
							} else if (var7 == 7) { // L: 7962
								var43.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, NetFileRequest.Client_plane, var4, var5, var2, false, var43.renderable1);
							} else if (var7 == 8) { // L: 7963
								var43.renderable1 = new DynamicObject(var11, 4, var8 + 4, NetFileRequest.Client_plane, var4, var5, var2, false, var43.renderable1); // L: 7964
								var43.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, NetFileRequest.Client_plane, var4, var5, var2, false, var43.renderable2); // L: 7965
							}
						} else {
							var43.renderable1 = new DynamicObject(var11, 4, var8, NetFileRequest.Client_plane, var4, var5, var2, false, var43.renderable1);
						}

						return; // L: 7967
					}
				}

				if (var9 == 2) { // L: 7970
					GameObject var44 = UserComparator4.scene.getGameObject(NetFileRequest.Client_plane, var4, var5); // L: 7971
					if (var7 == 11) { // L: 7972
						var7 = 10;
					}

					if (var44 != null) { // L: 7973
						var44.renderable = new DynamicObject(class299.Entity_unpackID(var44.tag), var7, var8, NetFileRequest.Client_plane, var4, var5, var2, false, var44.renderable); // L: 7974
						return; // L: 7975
					}
				}

				if (var9 == 3) { // L: 7978
					GroundObject var45 = UserComparator4.scene.getGroundObject(NetFileRequest.Client_plane, var4, var5); // L: 7979
					if (var45 != null) { // L: 7980
						var45.renderable = new DynamicObject(class299.Entity_unpackID(var45.tag), 22, var8, NetFileRequest.Client_plane, var4, var5, var2, false, var45.renderable); // L: 7981
						return; // L: 7982
					}
				}

				class324.method6099(NetFileRequest.Client_plane, var4, var5, var9, var2); // L: 7985
			}

		} else {
			NodeDeque var31;
			TileItem var32;
			if (class294.field3207 == var0) { // L: 7989
				var2 = var1.readUnsignedShort(); // L: 7990
				var3 = var1.method8998(); // L: 7991
				var4 = var1.method9050(); // L: 7992
				var5 = (var4 >> 4 & 7) + InvDefinition.field1908; // L: 7993
				var6 = (var4 & 7) + class124.field1461; // L: 7994
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7995
					var31 = Client.groundItems[NetFileRequest.Client_plane][var5][var6]; // L: 7996
					if (var31 != null) { // L: 7997
						for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 7998 7999 8004
							if ((var2 & 32767) == var32.id) { // L: 8000
								var32.method2640(var3); // L: 8001
								break;
							}
						}
					}
				}

			} else if (class294.field3211 == var0) { // L: 8010
				var2 = var1.method9050(); // L: 8011
				var3 = (var2 >> 4 & 7) + InvDefinition.field1908; // L: 8012
				var4 = (var2 & 7) + class124.field1461; // L: 8013
				var5 = var1.method8967(); // L: 8014
				var6 = var1.method9005(); // L: 8015
				var7 = var1.readInt(); // L: 8016
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8017
					NodeDeque var42 = Client.groundItems[NetFileRequest.Client_plane][var3][var4]; // L: 8018
					if (var42 != null) { // L: 8019
						for (TileItem var34 = (TileItem)var42.last(); var34 != null; var34 = (TileItem)var42.previous()) { // L: 8020 8021 8026
							if ((var6 & 32767) == var34.id && var5 == var34.quantity) { // L: 8022
								var34.quantity = var7; // L: 8023
								break;
							}
						}

						class14.updateItemPile(var3, var4); // L: 8028
					}
				}

			} else {
				int var10;
				int var13;
				int var14;
				byte var36;
				if (class294.field3206 == var0) { // L: 8033
					byte var37 = var1.readByte(); // L: 8034
					var36 = var1.method9000(); // L: 8035
					var4 = var1.method9026(); // L: 8036
					var5 = var1.readUnsignedByte() * 4; // L: 8037
					var6 = var1.method9006(); // L: 8038
					var7 = var1.method8998() * 4; // L: 8039
					var8 = var1.method9006(); // L: 8040
					var9 = var1.method9131(); // L: 8041
					var10 = var1.method8998(); // L: 8042
					var11 = (var10 >> 4 & 7) + InvDefinition.field1908; // L: 8043
					int var40 = (var10 & 7) + class124.field1461; // L: 8044
					var13 = var1.method9007(); // L: 8045
					var14 = var1.method8998(); // L: 8046
					var2 = var37 + var11; // L: 8047
					var3 = var36 + var40; // L: 8048
					if (var11 >= 0 && var40 >= 0 && var11 < 104 && var40 < 104 && var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var6 != 65535) { // L: 8049
						var11 = var11 * 128 + 64; // L: 8050
						var40 = var40 * 128 + 64; // L: 8051
						var2 = var2 * 128 + 64; // L: 8052
						var3 = var3 * 128 + 64; // L: 8053
						Projectile var33 = new Projectile(var6, NetFileRequest.Client_plane, var11, var40, class208.getTileHeight(var11, var40, NetFileRequest.Client_plane) - var5, var13 + Client.cycle, var8 + Client.cycle, var14, var4, var9, var7); // L: 8054
						var33.setDestination(var2, var3, class208.getTileHeight(var2, var3, NetFileRequest.Client_plane) - var7, var13 + Client.cycle); // L: 8055
						Client.projectiles.addFirst(var33); // L: 8056
					}

				} else if (class294.field3210 == var0) { // L: 8060
					var2 = var1.method8998(); // L: 8061
					var3 = var1.readUnsignedByte(); // L: 8062
					var4 = var3 >> 2; // L: 8063
					var5 = var3 & 3; // L: 8064
					var6 = Client.field717[var4]; // L: 8065
					var7 = var1.method9007(); // L: 8066
					var8 = var1.readUnsignedByte(); // L: 8067
					var9 = (var8 >> 4 & 7) + InvDefinition.field1908; // L: 8068
					var10 = (var8 & 7) + class124.field1461; // L: 8069
					if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 8070
						class178.method3500(NetFileRequest.Client_plane, var9, var10, var6, var7, var4, var5, var2, 0, -1); // L: 8071
					}

				} else if (class294.field3213 == var0) { // L: 8075
					var2 = var1.readUnsignedByte(); // L: 8076
					var3 = (var2 >> 4 & 7) + InvDefinition.field1908; // L: 8077
					var4 = (var2 & 7) + class124.field1461; // L: 8078
					var5 = var1.method9005(); // L: 8079
					var6 = var1.method8998(); // L: 8080
					var7 = var1.readUnsignedShort(); // L: 8081
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8082
						var3 = var3 * 128 + 64; // L: 8083
						var4 = var4 * 128 + 64; // L: 8084
						GraphicsObject var41 = new GraphicsObject(var7, NetFileRequest.Client_plane, var3, var4, class208.getTileHeight(var3, var4, NetFileRequest.Client_plane) - var6, var5, Client.cycle); // L: 8085
						Client.graphicsObjects.addFirst(var41); // L: 8086
					}

				} else {
					if (class294.field3205 == var0) { // L: 8090
						var2 = var1.method9026(); // L: 8091
						var3 = (var2 >> 4 & 7) + InvDefinition.field1908; // L: 8092
						var4 = (var2 & 7) + class124.field1461; // L: 8093
						var5 = var1.method8998(); // L: 8094
						var6 = var5 >> 4 & 15; // L: 8095
						var7 = var5 & 7; // L: 8096
						var8 = var1.method9005(); // L: 8097
						var9 = var1.method9050(); // L: 8098
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8099
							var10 = var6 + 1; // L: 8100
							if (HitSplatDefinition.localPlayer.pathX[0] >= var3 - var10 && HitSplatDefinition.localPlayer.pathX[0] <= var3 + var10 && HitSplatDefinition.localPlayer.pathY[0] >= var4 - var10 && HitSplatDefinition.localPlayer.pathY[0] <= var4 + var10 && WorldMapManager.clientPreferences.method2444() != 0 && var7 > 0 && Client.soundEffectCount < 50) { // L: 8101 8102
								Client.soundEffectIds[Client.soundEffectCount] = var8; // L: 8103
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var7; // L: 8104
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9; // L: 8105
								Client.soundEffects[Client.soundEffectCount] = null; // L: 8106
								Client.soundLocations[Client.soundEffectCount] = var6 + (var4 << 8) + (var3 << 16); // L: 8107
								++Client.soundEffectCount; // L: 8108
							}
						}
					}

					if (class294.field3203 == var0) { // L: 8113
						var2 = var1.method9007(); // L: 8114
						var36 = var1.method8965(); // L: 8115
						byte var38 = var1.readByte(); // L: 8116
						byte var39 = var1.method8965(); // L: 8117
						var6 = var1.method9006(); // L: 8118
						var7 = var1.method8998(); // L: 8119
						var8 = var7 >> 2; // L: 8120
						var9 = var7 & 3; // L: 8121
						var10 = Client.field717[var8]; // L: 8122
						var11 = var1.method9005(); // L: 8123
						byte var12 = var1.method9000(); // L: 8124
						var13 = var1.method8998(); // L: 8125
						var14 = (var13 >> 4 & 7) + InvDefinition.field1908; // L: 8126
						int var15 = (var13 & 7) + class124.field1461; // L: 8127
						int var16 = var1.readUnsignedShort(); // L: 8128
						Player var17;
						if (var16 == Client.localPlayerIndex) { // L: 8130
							var17 = HitSplatDefinition.localPlayer;
						} else {
							var17 = Client.players[var16]; // L: 8131
						}

						if (var17 != null) { // L: 8132
							ObjectComposition var18 = class59.getObjectDefinition(var6); // L: 8133
							int var19;
							int var20;
							if (var9 != 1 && var9 != 3) { // L: 8136
								var19 = var18.sizeX; // L: 8141
								var20 = var18.sizeY; // L: 8142
							} else {
								var19 = var18.sizeY; // L: 8137
								var20 = var18.sizeX; // L: 8138
							}

							int var21 = var14 + (var19 >> 1); // L: 8144
							int var22 = var14 + (var19 + 1 >> 1); // L: 8145
							int var23 = var15 + (var20 >> 1); // L: 8146
							int var24 = var15 + (var20 + 1 >> 1); // L: 8147
							int[][] var25 = Tiles.Tiles_heights[NetFileRequest.Client_plane]; // L: 8148
							int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2; // L: 8149
							int var27 = (var14 << 7) + (var19 << 6); // L: 8150
							int var28 = (var15 << 7) + (var20 << 6); // L: 8151
							Model var29 = var18.getModel(var8, var9, var25, var27, var26, var28); // L: 8152
							if (var29 != null) { // L: 8153
								class178.method3500(NetFileRequest.Client_plane, var14, var15, var10, -1, 0, 0, 31, var2 + 1, var11 + 1); // L: 8154
								var17.animationCycleStart = var2 + Client.cycle; // L: 8155
								var17.animationCycleEnd = var11 + Client.cycle; // L: 8156
								var17.model0 = var29; // L: 8157
								var17.field1087 = var14 * 128 + var19 * 64; // L: 8158
								var17.field1100 = var15 * 128 + var20 * 64; // L: 8159
								var17.tileHeight2 = var26; // L: 8160
								byte var30;
								if (var39 > var36) { // L: 8161
									var30 = var39; // L: 8162
									var39 = var36; // L: 8163
									var36 = var30; // L: 8164
								}

								if (var38 > var12) { // L: 8166
									var30 = var38; // L: 8167
									var38 = var12; // L: 8168
									var12 = var30; // L: 8169
								}

								var17.minX = var39 + var14; // L: 8171
								var17.maxX = var14 + var36; // L: 8172
								var17.minY = var15 + var38; // L: 8173
								var17.maxY = var15 + var12; // L: 8174
							}
						}
					}

					if (class294.field3212 == var0) { // L: 8178
						var2 = var1.method9026(); // L: 8179
						var3 = (var2 >> 4 & 7) + InvDefinition.field1908; // L: 8180
						var4 = (var2 & 7) + class124.field1461; // L: 8181
						var1.method9026(); // L: 8182
						var5 = var1.method8967(); // L: 8183
						var1.method9005(); // L: 8184
						var6 = var1.method9007(); // L: 8185
						var1.method9050(); // L: 8186
						var1.method9005(); // L: 8187
						var7 = var1.readUnsignedByte(); // L: 8188
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8189
							var32 = new TileItem(); // L: 8190
							var32.id = var6; // L: 8191
							var32.quantity = var5; // L: 8192
							var32.method2640(var7); // L: 8193
							if (Client.groundItems[NetFileRequest.Client_plane][var3][var4] == null) { // L: 8194
								Client.groundItems[NetFileRequest.Client_plane][var3][var4] = new NodeDeque(); // L: 8195
							}

							Client.groundItems[NetFileRequest.Client_plane][var3][var4].addFirst(var32); // L: 8197
							class14.updateItemPile(var3, var4); // L: 8198
						}

					} else if (class294.field3204 != var0) { // L: 8202
						if (class294.field3209 == var0) { // L: 8225
							var2 = var1.readUnsignedByte(); // L: 8226
							var3 = (var2 >> 4 & 7) + InvDefinition.field1908; // L: 8227
							var4 = (var2 & 7) + class124.field1461; // L: 8228
							var5 = var1.method9050(); // L: 8229
							var6 = var5 >> 2; // L: 8230
							var7 = var5 & 3; // L: 8231
							var8 = Client.field717[var6]; // L: 8232
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 8233
								class178.method3500(NetFileRequest.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1); // L: 8234
							}

						}
					} else {
						var2 = var1.readInt(); // L: 8203
						var3 = var1.readUnsignedByte(); // L: 8204
						var4 = (var3 >> 4 & 7) + InvDefinition.field1908; // L: 8205
						var5 = (var3 & 7) + class124.field1461; // L: 8206
						var6 = var1.method9005(); // L: 8207
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8208
							var31 = Client.groundItems[NetFileRequest.Client_plane][var4][var5]; // L: 8209
							if (var31 != null) { // L: 8210
								for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) { // L: 8211 8212 8217
									if ((var6 & 32767) == var32.id && var2 == var32.quantity) { // L: 8213
										var32.remove(); // L: 8214
										break;
									}
								}

								if (var31.last() == null) { // L: 8219
									Client.groundItems[NetFileRequest.Client_plane][var4][var5] = null;
								}

								class14.updateItemPile(var4, var5); // L: 8220
							}
						}

					}
				}
			}
		}
	} // L: 7987 8008 8031 8058 8073 8088 8200 8223 8236 8238
}
