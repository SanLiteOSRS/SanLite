import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class197 implements class30 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	Widget field2233;
	@ObfuscatedName("f")
	boolean field2234;
	@ObfuscatedName("c")
	boolean field2235;

	public class197() {
		this.field2233 = null;
		this.field2234 = false;
		this.field2235 = false; // L: 16
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1393279885"
	)
	public boolean vmethod3949(int var1) {
		if (this.field2233 == null) { // L: 55
			return false;
		} else {
			class28 var2 = this.field2233.method6078(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method429(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2235 = true; // L: 61
						break;
					case 82:
						this.field2234 = true;
						break; // L: 69
					default:
						if (this.method3917(var1)) { // L: 64
							class143.invalidateWidget(this.field2233); // L: 65
						}
					}
				}

				return var2.method410(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1545920011"
	)
	public boolean vmethod3989(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2235 = false; // L: 79
			return false; // L: 80
		case 82:
			this.field2234 = false; // L: 82
			return false; // L: 83
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1185620152"
	)
	public boolean vmethod3951(char var1) {
		if (this.field2233 == null) { // L: 89
			return false;
		} else if (!class283.method5443(var1)) { // L: 90
			return false;
		} else {
			class300 var2 = this.field2233.method6076(); // L: 91
			if (var2 != null && var2.method5906()) { // L: 92
				class28 var3 = this.field2233.method6078(); // L: 93
				if (var3 == null) {
					return false; // L: 94
				} else {
					if (var3.method426(var1) && var2.method5784(var1)) { // L: 95 96
						class143.invalidateWidget(this.field2233); // L: 97
					}

					return var3.method411(var1); // L: 100
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "109"
	)
	public boolean vmethod3953(boolean var1) {
		return false; // L: 104
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-1658899548"
	)
	public void method3915(Widget var1) {
		this.method3933(); // L: 19
		if (var1 != null) { // L: 20
			this.field2233 = var1; // L: 21
			class298 var2 = var1.method6079(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3419.method5767(true); // L: 24
				if (var2.field3413 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2233(var1); // L: 27
					var3.setArgs(var2.field3413); // L: 28
					class420.method7802().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lkn;",
		garbageValue = "1763353242"
	)
	public Widget method3916() {
		return this.field2233; // L: 36
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method3933() {
		if (this.field2233 != null) { // L: 40
			class298 var1 = this.field2233.method6079(); // L: 41
			Widget var2 = this.field2233; // L: 42
			this.field2233 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3419.method5767(false); // L: 45
				if (var1.field3413 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2233(var2); // L: 48
					var3.setArgs(var1.field3413); // L: 49
					class420.method7802().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1419788779"
	)
	boolean method3917(int var1) {
		if (this.field2233 == null) { // L: 108
			return false;
		} else {
			class300 var2 = this.field2233.method6076(); // L: 109
			if (var2 != null && var2.method5906()) { // L: 110
				switch(var1) { // L: 111
				case 13:
					this.method3933(); // L: 231
					return true; // L: 232
				case 48:
					if (this.field2234) { // L: 200
						var2.method5770(); // L: 201
					}

					return true; // L: 203
				case 65:
					if (this.field2234) { // L: 139
						var2.method5809(MouseHandler.method676()); // L: 140
					}

					return true; // L: 142
				case 66:
					if (this.field2234) { // L: 218
						var2.method5840(MouseHandler.method676()); // L: 219
					}

					return true; // L: 221
				case 67:
					if (this.field2234) { // L: 205
						var2.method5854(MouseHandler.method676()); // L: 206
					}

					return true; // L: 208
				case 84:
					if (var2.method5829() == 0) { // L: 113
						var2.method5784(10); // L: 114
					} else if (this.field2235 && var2.method5833()) { // L: 117
						var2.method5784(10); // L: 118
					} else {
						class298 var3 = this.field2233.method6079(); // L: 121
						ScriptEvent var4 = new ScriptEvent(); // L: 122
						var4.method2233(this.field2233); // L: 123
						var4.setArgs(var3.field3416); // L: 124
						class420.method7802().addFirst(var4); // L: 125
						this.method3933(); // L: 126
					}

					return true; // L: 129
				case 85:
					if (this.field2234) { // L: 160
						var2.method5787(); // L: 161
					} else {
						var2.method5823(); // L: 164
					}

					return true; // L: 166
				case 96:
					if (this.field2234) { // L: 223
						var2.method5798(this.field2235); // L: 224
					} else {
						var2.method6028(this.field2235); // L: 227
					}

					return true; // L: 229
				case 97:
					if (this.field2234) { // L: 184
						var2.method5799(this.field2235); // L: 185
					} else {
						var2.method5786(this.field2235); // L: 188
					}

					return true; // L: 190
				case 98:
					if (this.field2234) { // L: 144
						var2.method5917(); // L: 145
					} else {
						var2.method5886(this.field2235); // L: 148
					}

					return true; // L: 150
				case 99:
					if (this.field2234) { // L: 210
						var2.method5804(); // L: 211
					} else {
						var2.method6010(this.field2235); // L: 214
					}

					return true; // L: 216
				case 101:
					if (this.field2234) { // L: 176
						var2.method5953(); // L: 177
					} else {
						var2.method5872(); // L: 180
					}

					return true; // L: 182
				case 102:
					if (this.field2234) { // L: 168
						var2.method5867(this.field2235); // L: 169
					} else {
						var2.method5792(this.field2235); // L: 172
					}

					return true; // L: 174
				case 103:
					if (this.field2234) { // L: 131
						var2.method5825(this.field2235); // L: 132
					} else {
						var2.method5853(this.field2235); // L: 135
					}

					return true; // L: 137
				case 104:
					if (this.field2234) { // L: 192
						var2.method5937(this.field2235); // L: 193
					} else {
						var2.method5768(this.field2235); // L: 196
					}

					return true; // L: 198
				case 105:
					if (this.field2234) { // L: 152
						var2.method5805(this.field2235); // L: 153
					} else {
						var2.method5803(this.field2235); // L: 156
					}

					return true; // L: 158
				default:
					return false; // L: 234
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("a")
	public static final void method3946(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				class248.method5160(var0 - 1L); // L: 11
				class248.method5160(1L); // L: 12
			} else {
				class248.method5160(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1317494492"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12524
			PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3006, Client.packetWriter.isaacCipher); // L: 12526
			var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0)); // L: 12527
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12528
			Client.packetWriter.addNode(var1); // L: 12529
		}
	} // L: 12530

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1343793560"
	)
	static final void method3914(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12554
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3215()) { // L: 12555
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12556
				if (var2.rank == -1) { // L: 12557
					PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3071, Client.packetWriter.isaacCipher); // L: 12558
					var3.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12559
					var3.packetBuffer.writeByte(var0); // L: 12560
					var3.packetBuffer.writeShort(var1); // L: 12561
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12562
					Client.packetWriter.addNode(var3); // L: 12563
				}
			}
		}
	} // L: 12564

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)I",
		garbageValue = "-807542260"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12588
		return var1 != null ? var1.integer : var0.flags; // L: 12589 12590
	}
}
