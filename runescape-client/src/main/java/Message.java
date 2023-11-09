import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1117255211
	)
	@Export("count")
	int count;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -524761677
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -53488167
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@Export("sender")
	String sender;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("al")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("at")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1617874492"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class129.method3123(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "769376242"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = World.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1267480248"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1426002396"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1665665360"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = World.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-90703200"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) { // L: 65
			this.senderUsername = new Username(ModeWhere.method6952(this.sender), class70.loginType);
		} else {
			this.senderUsername = null; // L: 66
		}

	} // L: 67

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IIIBZB)V",
		garbageValue = "12"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2);
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
		if (var8 == null) {
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 225
			if (var8 == null) { // L: 226
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
				if (var8 != null) { // L: 228
					if (var5) { // L: 229
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount; // L: 232
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0; // L: 242
					var8.crc = var3; // L: 243
					var8.padding = var4;
					if (var5) { // L: 245
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lek;FZI)F",
		garbageValue = "1357377055"
	)
	static float method1204(class125 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 172
		if (var0 != null && var0.method3068() != 0) { // L: 173
			float var4 = (float)var0.field1511[0].field1452; // L: 176
			float var5 = (float)var0.field1511[var0.method3068() - 1].field1452; // L: 177
			float var6 = var5 - var4; // L: 178
			if ((double)var6 == 0.0D) { // L: 179
				return var0.field1511[0].field1455; // L: 180
			} else {
				float var7 = 0.0F; // L: 182
				if (var1 > var5) { // L: 183
					var7 = (var1 - var5) / var6; // L: 184
				} else {
					var7 = (var1 - var4) / var6; // L: 187
				}

				double var8 = (double)((int)var7); // L: 189
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 190
				float var11 = var10 * var6; // L: 191
				var8 = Math.abs(1.0D + var8); // L: 192
				double var12 = var8 / 2.0D; // L: 193
				double var14 = (double)((int)var12); // L: 194
				var10 = (float)(var12 - var14); // L: 195
				float var16;
				float var17;
				if (var2) { // L: 198
					if (var0.field1512 == class123.field1491) { // L: 199
						if ((double)var10 != 0.0D) { // L: 200
							var11 += var4; // L: 201
						} else {
							var11 = var5 - var11; // L: 204
						}
					} else if (var0.field1512 != class123.field1489 && var0.field1512 != class123.field1490) { // L: 207
						if (var0.field1512 == class123.field1487) { // L: 210
							var11 = var4 - var1; // L: 211
							var16 = var0.field1511[0].field1451; // L: 212
							var17 = var0.field1511[0].field1449; // L: 213
							var3 = var0.field1511[0].field1455; // L: 214
							if (0.0D != (double)var16) { // L: 215
								var3 -= var11 * var17 / var16; // L: 216
							}

							return var3; // L: 218
						}
					} else {
						var11 = var5 - var11; // L: 208
					}
				} else if (var0.field1528 == class123.field1491) { // L: 222
					if ((double)var10 != 0.0D) { // L: 223
						var11 = var5 - var11; // L: 224
					} else {
						var11 += var4; // L: 227
					}
				} else if (var0.field1528 != class123.field1489 && var0.field1528 != class123.field1490) { // L: 230
					if (var0.field1528 == class123.field1487) { // L: 233
						var11 = var1 - var5; // L: 234
						var16 = var0.field1511[var0.method3068() - 1].field1453; // L: 235
						var17 = var0.field1511[var0.method3068() - 1].field1450; // L: 236
						var3 = var0.field1511[var0.method3068() - 1].field1455; // L: 237
						if (0.0D != (double)var16) { // L: 238
							var3 += var17 * var11 / var16; // L: 239
						}

						return var3; // L: 241
					}
				} else {
					var11 += var4; // L: 231
				}

				var3 = GrandExchangeEvent.method6858(var0, var11); // L: 244
				float var18;
				if (var2 && var0.field1512 == class123.field1490) { // L: 246
					var18 = var0.field1511[var0.method3068() - 1].field1455 - var0.field1511[0].field1455; // L: 247
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 248
				} else if (!var2 && var0.field1528 == class123.field1490) { // L: 250
					var18 = var0.field1511[var0.method3068() - 1].field1455 - var0.field1511[0].field1455; // L: 251
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 252
				}

				return var3; // L: 254
			}
		} else {
			return var3; // L: 174
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIIZI)V",
		garbageValue = "-1910917952"
	)
	public static void method1201(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class297.musicPlayerStatus = 1; // L: 42
		class297.musicTrackArchive = var0; // L: 43
		class379.musicTrackGroupId = var1; // L: 44
		VarpDefinition.musicTrackFileId = var2; // L: 45
		class100.musicTrackVolume = var3; // L: 46
		class120.musicTrackBoolean = var4; // L: 47
		class162.pcmSampleLength = 10000; // L: 48
	} // L: 49

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "33"
	)
	static final void method1174(String var0) {
		VerticalAlignment.method3825("Please remove " + var0 + " from your ignore list first"); // L: 121
	} // L: 122

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1238902143"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = SoundSystem.getWidgetChild(var1, var2); // L: 9502
		if (var5 != null) { // L: 9503
			if (var5.onOp != null) { // L: 9504
				ScriptEvent var6 = new ScriptEvent(); // L: 9505
				var6.widget = var5; // L: 9506
				var6.opIndex = var0; // L: 9507
				var6.targetName = var4; // L: 9508
				var6.args = var5.onOp; // L: 9509
				HealthBarUpdate.runScriptEvent(var6); // L: 9510
			}

			boolean var11 = true; // L: 9512
			if (var5.contentType > 0) { // L: 9513
				var11 = method1199(var5);
			}

			if (var11) { // L: 9514
				int var8 = class25.getWidgetFlags(var5); // L: 9516
				int var9 = var0 - 1; // L: 9517
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9519
				if (var7) { // L: 9521
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9524
						var10 = class330.getPacketBufferNode(ClientPacket.field3190, Client.packetWriter.isaacCipher); // L: 9526
						var10.packetBuffer.writeInt(var1); // L: 9527
						var10.packetBuffer.writeShort(var2); // L: 9528
						var10.packetBuffer.writeShort(var3); // L: 9529
						Client.packetWriter.addNode(var10); // L: 9530
					}

					if (var0 == 2) { // L: 9532
						var10 = class330.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 9534
						var10.packetBuffer.writeInt(var1); // L: 9535
						var10.packetBuffer.writeShort(var2); // L: 9536
						var10.packetBuffer.writeShort(var3); // L: 9537
						Client.packetWriter.addNode(var10); // L: 9538
					}

					if (var0 == 3) { // L: 9540
						var10 = class330.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 9542
						var10.packetBuffer.writeInt(var1); // L: 9543
						var10.packetBuffer.writeShort(var2); // L: 9544
						var10.packetBuffer.writeShort(var3); // L: 9545
						Client.packetWriter.addNode(var10); // L: 9546
					}

					if (var0 == 4) { // L: 9548
						var10 = class330.getPacketBufferNode(ClientPacket.field3104, Client.packetWriter.isaacCipher); // L: 9550
						var10.packetBuffer.writeInt(var1); // L: 9551
						var10.packetBuffer.writeShort(var2); // L: 9552
						var10.packetBuffer.writeShort(var3); // L: 9553
						Client.packetWriter.addNode(var10); // L: 9554
					}

					if (var0 == 5) { // L: 9556
						var10 = class330.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 9558
						var10.packetBuffer.writeInt(var1); // L: 9559
						var10.packetBuffer.writeShort(var2); // L: 9560
						var10.packetBuffer.writeShort(var3); // L: 9561
						Client.packetWriter.addNode(var10); // L: 9562
					}

					if (var0 == 6) { // L: 9564
						var10 = class330.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 9566
						var10.packetBuffer.writeInt(var1); // L: 9567
						var10.packetBuffer.writeShort(var2); // L: 9568
						var10.packetBuffer.writeShort(var3); // L: 9569
						Client.packetWriter.addNode(var10); // L: 9570
					}

					if (var0 == 7) { // L: 9572
						var10 = class330.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher); // L: 9574
						var10.packetBuffer.writeInt(var1); // L: 9575
						var10.packetBuffer.writeShort(var2); // L: 9576
						var10.packetBuffer.writeShort(var3); // L: 9577
						Client.packetWriter.addNode(var10); // L: 9578
					}

					if (var0 == 8) { // L: 9580
						var10 = class330.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 9582
						var10.packetBuffer.writeInt(var1); // L: 9583
						var10.packetBuffer.writeShort(var2); // L: 9584
						var10.packetBuffer.writeShort(var3); // L: 9585
						Client.packetWriter.addNode(var10); // L: 9586
					}

					if (var0 == 9) { // L: 9588
						var10 = class330.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher); // L: 9590
						var10.packetBuffer.writeInt(var1); // L: 9591
						var10.packetBuffer.writeShort(var2); // L: 9592
						var10.packetBuffer.writeShort(var3); // L: 9593
						Client.packetWriter.addNode(var10); // L: 9594
					}

					if (var0 == 10) { // L: 9596
						var10 = class330.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 9598
						var10.packetBuffer.writeInt(var1); // L: 9599
						var10.packetBuffer.writeShort(var2); // L: 9600
						var10.packetBuffer.writeShort(var3); // L: 9601
						Client.packetWriter.addNode(var10); // L: 9602
					}

				}
			}
		}
	} // L: 9522 9604

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lmq;B)Z",
		garbageValue = "-85"
	)
	static final boolean method1199(Widget var0) {
		int var1 = var0.contentType; // L: 11835
		if (var1 == 205) { // L: 11836
			Client.logoutTimer = 250; // L: 11837
			return true; // L: 11838
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11840
				var2 = (var1 - 300) / 2; // L: 11841
				var3 = var1 & 1; // L: 11842
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11843
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11845
				var2 = (var1 - 314) / 2; // L: 11846
				var3 = var1 & 1; // L: 11847
				Client.playerAppearance.method6057(var2, var3 == 1); // L: 11848
			}

			if (var1 == 324) {
				Client.playerAppearance.method6042(0); // L: 11850
			}

			if (var1 == 325) { // L: 11851
				Client.playerAppearance.method6042(1);
			}

			if (var1 == 326) { // L: 11852
				PacketBufferNode var4 = class330.getPacketBufferNode(ClientPacket.field3102, Client.packetWriter.isaacCipher); // L: 11854
				Client.playerAppearance.write(var4.packetBuffer); // L: 11855
				Client.packetWriter.addNode(var4); // L: 11856
				return true; // L: 11857
			} else {
				return false; // L: 11859
			}
		}
	}
}
