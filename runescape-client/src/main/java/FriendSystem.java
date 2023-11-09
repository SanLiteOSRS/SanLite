import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -337243131
	)
	int field833;

	@ObfuscatedSignature(
		descriptor = "(Lqi;)V"
	)
	FriendSystem(LoginType var1) {
		this.field833 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2100463332"
	)
	boolean method1827() {
		return this.field833 == 2; // L: 32
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	final void method1822() {
		this.field833 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "15"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field833 = 2; // L: 41
		class344.method6674(); // L: 42
	} // L: 43

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1832627577"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4520 < Message.method1197() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					KitDefinition.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					KitDefinition.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	@Export("clear")
	final void clear() {
		this.field833 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lrp;ZI)Z",
		garbageValue = "-112378137"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(class155.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)Z",
		garbageValue = "3"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "182534146"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					Object var10000 = null; // L: 80
					String var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					KitDefinition.addGameMessage(30, "", var4);
				} else if (class155.localPlayer.username.equals(var2)) {
					Skeleton.method4428();
				} else if (this.isFriended(var2, false)) {
					class1.method10(var1);
				} else if (this.isIgnored(var2)) { // L: 95
					WorldMapDecorationType.method6362(var1); // L: 96
				} else {
					PacketBufferNode var3 = class136.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 103
					Client.packetWriter.addNode(var3);
				}
			}
		}
	} // L: 89

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-922602942"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field692 != 1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "6"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) { // L: 139
				StringBuilder var10000;
				String var4;
				if (this.canAddIgnore()) { // L: 140
					var10000 = null;
					var4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					KitDefinition.addGameMessage(30, "", var4);
				} else if (class155.localPlayer.username.equals(var2)) {
					class4.method21();
				} else if (this.isIgnored(var2)) {
					class317.method6371(var1);
				} else if (this.isFriended(var2, false)) {
					var10000 = new StringBuilder();
					Object var10001 = null;
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					var4 = var10000.append(" from your friend list first").toString();
					KitDefinition.addGameMessage(30, "", var4); // L: 161
				} else {
					PacketBufferNode var3 = class136.getPacketBufferNode(ClientPacket.field3075, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var1)); // L: 169
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	} // L: 155 164

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "42588260"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field692 != 1; // L: 190
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1809224453"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 197
			Username var2 = new Username(var1, this.loginType); // L: 198
			if (var2.hasCleanName()) { // L: 199
				if (this.friendsList.removeByUsername(var2)) { // L: 200
					Client.field715 = Client.cycleCntr; // L: 202
					PacketBufferNode var3 = class136.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 205
					var3.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var1)); // L: 206
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 207
					Client.packetWriter.addNode(var3); // L: 208
				}

				class344.method6674(); // L: 210
			}
		}
	} // L: 211

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1971260533"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 214
			Username var2 = new Username(var1, this.loginType); // L: 215
			if (var2.hasCleanName()) { // L: 216
				if (this.ignoreList.removeByUsername(var2)) { // L: 217
					Client.field715 = Client.cycleCntr; // L: 219
					PacketBufferNode var3 = class136.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 222
					var3.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var1)); // L: 223
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 224
					Client.packetWriter.addNode(var3); // L: 225
				}

				AbstractWorldMapData.FriendSystem_invalidateIgnoreds(); // L: 227
			}
		}
	} // L: 228

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)Z",
		garbageValue = "122630394"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqx;I)V",
		garbageValue = "1486405514"
	)
	static final void method1860(PacketBuffer var0) {
		int var1 = 0; // L: 81
		var0.importIndex(); // L: 82

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 83
			var5 = Players.Players_indices[var2]; // L: 84
			if ((Players.field1370[var5] & 1) == 0) { // L: 85
				if (var1 > 0) { // L: 86
					--var1; // L: 87
					var10000 = Players.field1370; // L: 88
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 91
					if (var4 == 0) { // L: 92
						var1 = class323.method6389(var0); // L: 93
						var10000 = Players.field1370; // L: 94
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class160.readPlayerUpdate(var0, var5); // L: 97
					}
				}
			}
		}

		var0.exportIndex(); // L: 100
		if (var1 != 0) { // L: 101
			throw new RuntimeException(); // L: 102
		} else {
			var0.importIndex(); // L: 104

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 105
				var5 = Players.Players_indices[var2]; // L: 106
				if ((Players.field1370[var5] & 1) != 0) { // L: 107
					if (var1 > 0) { // L: 108
						--var1; // L: 109
						var10000 = Players.field1370; // L: 110
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 113
						if (var4 == 0) { // L: 114
							var1 = class323.method6389(var0); // L: 115
							var10000 = Players.field1370;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class160.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1370[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1370;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = class323.method6389(var0);
								var10000 = Players.field1370; // L: 138
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (ArchiveDiskAction.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1370;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1370[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1; // L: 153
								var10000 = Players.field1370;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 157
								if (var4 == 0) { // L: 158
									var1 = class323.method6389(var0); // L: 159
									var10000 = Players.field1370; // L: 160
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (ArchiveDiskAction.updateExternalPlayer(var0, var5)) { // L: 163
									var10000 = Players.field1370;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 166
					if (var1 != 0) { // L: 167
						throw new RuntimeException(); // L: 168
					} else {
						Players.Players_count = 0; // L: 170
						Players.Players_emptyIdxCount = 0; // L: 171

						for (var2 = 1; var2 < 2048; ++var2) { // L: 172
							var10000 = Players.field1370; // L: 173
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 174
							if (var3 != null) { // L: 175
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 176
							}
						}

					}
				}
			}
		}
	} // L: 178

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbm;",
		garbageValue = "-457159576"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 116
		Buffer var2 = new Buffer(var0); // L: 117
		var2.offset = var2.array.length - 2; // L: 118
		int var3 = var2.readUnsignedShort(); // L: 119
		int var4 = var2.array.length - 2 - var3 - 12; // L: 120
		var2.offset = var4; // L: 121
		int var5 = var2.readInt(); // L: 122
		var1.localIntCount = var2.readUnsignedShort(); // L: 123
		var1.localStringCount = var2.readUnsignedShort(); // L: 124
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 125
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 126
		int var6 = var2.readUnsignedByte(); // L: 127
		int var7;
		int var8;
		if (var6 > 0) { // L: 128
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 129

			for (var7 = 0; var7 < var6; ++var7) { // L: 130
				var8 = var2.readUnsignedShort(); // L: 131
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? AccessFile.method8302(var8) : 1); // L: 132
				var1.switches[var7] = var9; // L: 133

				while (var8-- > 0) { // L: 134
					int var10 = var2.readInt(); // L: 135
					int var11 = var2.readInt(); // L: 136
					var9.put(new IntegerNode(var11), (long)var10); // L: 137
				}
			}
		}

		var2.offset = 0; // L: 141
		var1.field990 = var2.readStringCp1252NullTerminatedOrNull(); // L: 142
		var1.opcodes = new int[var5]; // L: 143
		var1.intOperands = new int[var5]; // L: 144
		var1.stringOperands = new String[var5]; // L: 145

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 146 147 152
			var8 = var2.readUnsignedShort(); // L: 148
			if (var8 == 3) { // L: 149
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 150
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 151
			}
		}

		return var1; // L: 154
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ldu;FZI)F",
		garbageValue = "-519959764"
	)
	static float method1828(class125 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 239
		if (var0 != null && var0.method2947() != 0) { // L: 240
			float var4 = (float)var0.field1541[0].field1502; // L: 243
			float var5 = (float)var0.field1541[var0.method2947() - 1].field1502; // L: 244
			float var6 = var5 - var4; // L: 245
			if (0.0D == (double)var6) { // L: 246
				return var0.field1541[0].field1497; // L: 247
			} else {
				float var7 = 0.0F; // L: 249
				if (var1 > var5) { // L: 250
					var7 = (var1 - var5) / var6; // L: 251
				} else {
					var7 = (var1 - var4) / var6; // L: 254
				}

				double var8 = (double)((int)var7); // L: 256
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 257
				float var11 = var10 * var6; // L: 258
				var8 = Math.abs(1.0D + var8); // L: 259
				double var12 = var8 / 2.0D; // L: 260
				double var14 = (double)((int)var12); // L: 261
				var10 = (float)(var12 - var14); // L: 262
				float var16;
				float var17;
				if (var2) { // L: 265
					if (var0.field1539 == class124.field1531) { // L: 266
						if (0.0D != (double)var10) { // L: 267
							var11 += var4; // L: 268
						} else {
							var11 = var5 - var11; // L: 271
						}
					} else if (var0.field1539 != class124.field1529 && var0.field1539 != class124.field1536) { // L: 274
						if (var0.field1539 == class124.field1528) { // L: 277
							var11 = var4 - var1; // L: 278
							var16 = var0.field1541[0].field1496; // L: 279
							var17 = var0.field1541[0].field1499; // L: 280
							var3 = var0.field1541[0].field1497; // L: 281
							if ((double)var16 != 0.0D) { // L: 282
								var3 -= var17 * var11 / var16; // L: 283
							}

							return var3; // L: 285
						}
					} else {
						var11 = var5 - var11; // L: 275
					}
				} else if (var0.field1540 == class124.field1531) { // L: 289
					if (0.0D != (double)var10) { // L: 290
						var11 = var5 - var11; // L: 291
					} else {
						var11 += var4; // L: 294
					}
				} else if (var0.field1540 != class124.field1529 && var0.field1540 != class124.field1536) { // L: 297
					if (var0.field1540 == class124.field1528) { // L: 300
						var11 = var1 - var5; // L: 301
						var16 = var0.field1541[var0.method2947() - 1].field1500; // L: 302
						var17 = var0.field1541[var0.method2947() - 1].field1498; // L: 303
						var3 = var0.field1541[var0.method2947() - 1].field1497; // L: 304
						if (0.0D != (double)var16) { // L: 305
							var3 += var17 * var11 / var16; // L: 306
						}

						return var3; // L: 308
					}
				} else {
					var11 += var4; // L: 298
				}

				var3 = FloorOverlayDefinition.method3995(var0, var11); // L: 311
				float var18;
				if (var2 && var0.field1539 == class124.field1536) { // L: 313
					var18 = var0.field1541[var0.method2947() - 1].field1497 - var0.field1541[0].field1497; // L: 314
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 315
				} else if (!var2 && var0.field1540 == class124.field1536) { // L: 317
					var18 = var0.field1541[var0.method2947() - 1].field1497 - var0.field1541[0].field1497; // L: 318
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 319
				}

				return var3; // L: 321
			}
		} else {
			return var3; // L: 241
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-52634308"
	)
	static final void method1862(Actor var0) {
		if (var0.field1249 != 0) { // L: 4179
			if (var0.targetIndex != -1) { // L: 4180
				Object var1 = null; // L: 4181
				int var2 = class200.field2314 ? 65536 : 32768; // L: 4182
				if (var0.targetIndex < var2) { // L: 4183
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= var2) { // L: 4184
					var1 = Client.players[var0.targetIndex - var2];
				}

				if (var1 != null) { // L: 4185
					int var3 = var0.x - ((Actor)var1).x; // L: 4186
					int var4 = var0.y - ((Actor)var1).y; // L: 4187
					if (var3 != 0 || var4 != 0) { // L: 4188
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4190
					var0.targetIndex = -1; // L: 4191
					var0.false0 = false; // L: 4192
				}
			}

			if (var0.field1190 != -1 && (var0.pathLength == 0 || var0.field1239 > 0)) { // L: 4195
				var0.orientation = var0.field1190; // L: 4196
				var0.field1190 = -1; // L: 4197
			}

			int var5 = var0.orientation - var0.rotation & 2047; // L: 4199
			if (var5 == 0 && var0.false0) { // L: 4200
				var0.targetIndex = -1; // L: 4201
				var0.false0 = false; // L: 4202
			}

			if (var5 != 0) { // L: 4204
				++var0.field1245; // L: 4205
				boolean var7;
				if (var5 > 1024) { // L: 4206
					var0.rotation -= var0.field1228 ? var5 : var0.field1249; // L: 4207
					var7 = true; // L: 4208
					if (var5 < var0.field1249 || var5 > 2048 - var0.field1249) { // L: 4209
						var0.rotation = var0.orientation; // L: 4210
						var7 = false; // L: 4211
					}

					if (!var0.field1228 && var0.idleSequence == var0.movementSequence && (var0.field1245 > 25 || var7)) { // L: 4213
						if (var0.turnLeftSequence != -1) { // L: 4214
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4215
						}
					}
				} else {
					var0.rotation += var0.field1228 ? var5 : var0.field1249; // L: 4219
					var7 = true; // L: 4220
					if (var5 < var0.field1249 || var5 > 2048 - var0.field1249) { // L: 4221
						var0.rotation = var0.orientation; // L: 4222
						var7 = false; // L: 4223
					}

					if (!var0.field1228 && var0.idleSequence == var0.movementSequence && (var0.field1245 > 25 || var7)) { // L: 4225
						if (var0.turnRightSequence != -1) { // L: 4226
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4227
						}
					}
				}

				var0.rotation &= 2047; // L: 4231
				var0.field1228 = false; // L: 4232
			} else {
				var0.field1245 = 0; // L: 4234
			}

		}
	} // L: 4235

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)Z",
		garbageValue = "-1358269638"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12608
	}
}
