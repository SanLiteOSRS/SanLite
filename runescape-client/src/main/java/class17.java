import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
class class17 implements SSLSession {
	@ObfuscatedName("ge")
	static String field102;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1898843179
	)
	static int field101;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Li;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field69; // L: 182
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9821"
	)
	public static final void method252() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 78
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 79
	} // L: 80

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1377085208"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10001
			ObjectSound.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10002
		}

		long var4 = -1L; // L: 10005
		long var6 = -1L; // L: 10006
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 10011
			if (var8 >= var10) { // L: 10013
				if (-1L != var4) { // L: 10156
					var8 = ClanChannelMember.method3084(var4); // L: 10157
					int var9 = (int)(var4 >>> 7 & 127L); // L: 10160
					Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10163
					ServerPacket.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 10164
				}

				return; // L: 10166
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10016
			if (var6 != var26) { // L: 10019
				label373: {
					var6 = var26; // L: 10020
					int var15 = class89.method2336(var8); // L: 10021
					long var18 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10025
					int var17 = (int)(var18 >>> 7 & 127L); // L: 10027
					var17 = var17; // L: 10031
					int var28 = WorldMapSprite.method5272(var8); // L: 10032
					int var19 = Projectile.method2105(var8); // L: 10033
					int var23;
					if (var28 == 2 && ReflectionCheck.scene.getObjectFlags(class383.Client_plane, var15, var17, var26) >= 0) { // L: 10034 10035
						ObjectComposition var20 = VarpDefinition.getObjectDefinition(var19); // L: 10036
						if (var20.transforms != null) { // L: 10037
							var20 = var20.transform();
						}

						if (var20 == null) { // L: 10038
							break label373;
						}

						PendingSpawn var21 = null; // L: 10039

						for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10040
							if (var22.plane == class383.Client_plane && var15 == var22.x && var17 == var22.y && var19 == var22.field1167) { // L: 10041
								var21 = var22; // L: 10042
								break;
							}
						}

						if (Client.isItemSelected == 1) { // L: 10046
							ObjectSound.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(65535) + var20.name, 1, var19, var15, var17); // L: 10047
						} else if (Client.isSpellSelected) { // L: 10050
							if ((class21.selectedSpellFlags & 4) == 4) { // L: 10051
								ObjectSound.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(65535) + var20.name, 2, var19, var15, var17); // L: 10052
							}
						} else {
							String[] var36 = var20.actions; // L: 10057
							if (var36 != null) { // L: 10058
								for (var23 = 4; var23 >= 0; --var23) { // L: 10059
									if ((var21 == null || var21.method2341(var23)) && var36[var23] != null) { // L: 10060 10061
										short var24 = 0; // L: 10062
										if (var23 == 0) { // L: 10063
											var24 = 3;
										}

										if (var23 == 1) { // L: 10064
											var24 = 4;
										}

										if (var23 == 2) { // L: 10065
											var24 = 5;
										}

										if (var23 == 3) { // L: 10066
											var24 = 6;
										}

										if (var23 == 4) { // L: 10067
											var24 = 1001;
										}

										ObjectSound.insertMenuItemNoShift(var36[var23], MouseRecorder.colorStartTag(65535) + var20.name, var24, var19, var15, var17); // L: 10068
									}
								}
							}

							ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var17); // L: 10073
						}
					}

					int var29;
					Player var30;
					NPC var37;
					int[] var38;
					if (var28 == 1) { // L: 10078
						NPC var32 = Client.npcs[var19]; // L: 10079
						if (var32 == null) { // L: 10080
							break label373;
						}

						if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 10081
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 10082
								var37 = Client.npcs[Client.npcIndices[var29]]; // L: 10083
								if (var37 != null && var37 != var32 && var37.definition.size == 1 && var37.x == var32.x && var32.y == var37.y) { // L: 10084
									ReflectionCheck.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count; // L: 10086
							var38 = Players.Players_indices; // L: 10087

							for (var23 = 0; var23 < var29; ++var23) { // L: 10088
								var30 = Client.players[var38[var23]]; // L: 10089
								if (var30 != null && var30.x == var32.x && var32.y == var30.y) { // L: 10090
									ServerPacket.addPlayerToMenu(var30, var38[var23], var15, var17);
								}
							}
						}

						ReflectionCheck.addNpcToMenu(var32, var19, var15, var17); // L: 10093
					}

					if (var28 == 0) { // L: 10095
						Player var33 = Client.players[var19]; // L: 10096
						if (var33 == null) { // L: 10097
							break label373;
						}

						if ((var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 10098
							for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 10099
								var37 = Client.npcs[Client.npcIndices[var29]]; // L: 10100
								if (var37 != null && var37.definition.size == 1 && var33.x == var37.x && var33.y == var37.y) { // L: 10101
									ReflectionCheck.addNpcToMenu(var37, Client.npcIndices[var29], var15, var17);
								}
							}

							var29 = Players.Players_count; // L: 10103
							var38 = Players.Players_indices; // L: 10104

							for (var23 = 0; var23 < var29; ++var23) { // L: 10105
								var30 = Client.players[var38[var23]]; // L: 10106
								if (var30 != null && var30 != var33 && var33.x == var30.x && var30.y == var33.y) { // L: 10107
									ServerPacket.addPlayerToMenu(var30, var38[var23], var15, var17);
								}
							}
						}

						if (var19 != Client.combatTargetPlayerIndex) { // L: 10110
							ServerPacket.addPlayerToMenu(var33, var19, var15, var17);
						} else {
							var4 = var26; // L: 10111
						}
					}

					if (var28 == 3) { // L: 10113
						NodeDeque var34 = Client.groundItems[class383.Client_plane][var15][var17]; // L: 10114
						if (var34 != null) { // L: 10115
							for (TileItem var35 = (TileItem)var34.first(); var35 != null; var35 = (TileItem)var34.next()) { // L: 10116 10117 10151
								ItemComposition var39 = NPCComposition.ItemComposition_get(var35.id); // L: 10118
								if (Client.isItemSelected == 1) { // L: 10119
									ObjectSound.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var17); // L: 10120
								} else if (Client.isSpellSelected) { // L: 10123
									if ((class21.selectedSpellFlags & 1) == 1) { // L: 10124
										ObjectSound.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseRecorder.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var17); // L: 10125
									}
								} else {
									String[] var31 = var39.groundActions; // L: 10130

									for (int var40 = 4; var40 >= 0; --var40) { // L: 10131
										if (var35.method2613(var40)) { // L: 10132
											if (var31 != null && var31[var40] != null) { // L: 10133
												byte var25 = 0; // L: 10134
												if (var40 == 0) { // L: 10135
													var25 = 18;
												}

												if (var40 == 1) { // L: 10136
													var25 = 19;
												}

												if (var40 == 2) { // L: 10137
													var25 = 20;
												}

												if (var40 == 3) { // L: 10138
													var25 = 21;
												}

												if (var40 == 4) { // L: 10139
													var25 = 22;
												}

												ObjectSound.insertMenuItemNoShift(var31[var40], MouseRecorder.colorStartTag(16748608) + var39.name, var25, var35.id, var15, var17); // L: 10140
											} else if (var40 == 2) { // L: 10143
												ObjectSound.insertMenuItemNoShift("Take", MouseRecorder.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var17); // L: 10144
											}
										}
									}

									ObjectSound.insertMenuItemNoShift("Examine", MouseRecorder.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var17); // L: 10148
								}
							}
						}
					}
				}
			}

			++var8; // L: 10007
		}
	}
}
