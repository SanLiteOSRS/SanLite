import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("FriendsList")
public class FriendsList extends NameableContainer {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2010685907
	)
	int field4555;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lsw;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 18
		this.field4555 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1; // L: 19
	} // L: 20

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lpw;",
		garbageValue = "1756938494"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Friend(); // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[Lpw;",
		garbageValue = "-463450295"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 29
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltm;ZI)Z",
		garbageValue = "-605757932"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 33
		if (var3 == null) { // L: 34
			return false;
		} else {
			return !var2 || var3.world != 0; // L: 35
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "-80"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 40
				boolean var3 = var1.readUnsignedByte() == 1; // L: 41
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 42
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 43
				int var6 = var1.readUnsignedShort(); // L: 44
				int var7 = var1.readUnsignedByte(); // L: 45
				int var8 = var1.readUnsignedByte(); // L: 46
				boolean var9 = (var8 & 2) != 0; // L: 47
				boolean var10 = (var8 & 1) != 0; // L: 48
				if (var6 > 0) { // L: 49
					var1.readStringCp1252NullTerminated(); // L: 50
					var1.readUnsignedByte(); // L: 51
					var1.readInt(); // L: 52
				}

				var1.readStringCp1252NullTerminated(); // L: 54
				if (var4 != null && var4.hasCleanName()) { // L: 55
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 56
					if (var3) { // L: 57
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 58
						if (var12 != null && var12 != var11) { // L: 59
							if (var11 != null) { // L: 60
								this.remove(var12); // L: 61
							} else {
								var11 = var12; // L: 64
							}
						}
					}

					if (var11 != null) { // L: 68
						this.changeName(var11, var4, var5); // L: 69
						if (var6 != var11.world) { // L: 70
							boolean var14 = true; // L: 71

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 72
								if (var13.username.equals(var4)) { // L: 73
									if (var6 != 0 && var13.world == 0) { // L: 74
										var13.remove(); // L: 75
										var14 = false; // L: 76
									} else if (var6 == 0 && var13.world != 0) { // L: 78
										var13.remove(); // L: 79
										var14 = false; // L: 80
									}
								}
							}

							if (var14) { // L: 84
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 87
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 88
					}

					if (var6 != var11.world) { // L: 91
						var11.int2 = ++this.field4555 - 1; // L: 92
						if (var11.world == -1 && var6 == 0) { // L: 93
							var11.int2 = -(var11.int2 * 1270747397) * 1907692493;
						}

						var11.world = var6; // L: 94
					}

					var11.rank = var7; // L: 96
					var11.field4571 = var9; // L: 97
					var11.field4570 = var10; // L: 98
					continue; // L: 99
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 100
			return; // L: 101
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)V",
		garbageValue = "544798953"
	)
	static void method7770(class206 var0) {
		if (var0 != null && var0.field2345 != null) { // L: 4919
			if (var0.field2345.childIndex >= 0) { // L: 4920
				Widget var1 = class165.getWidget(var0.field2345.parentId); // L: 4921
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2345.childIndex >= var1.children.length || var0.field2345 != var1.children[var0.field2345.childIndex]) { // L: 4922
					return; // L: 4923
				}
			}

			if (var0.field2345.type == 11 && var0.field2344 == 0) { // L: 4926
				if (var0.field2345.method6381(var0.field2348, var0.field2343, 0, 0)) { // L: 4927
					switch(var0.field2345.method6385()) { // L: 4928
					case 0:
						Ignored.openURL(var0.field2345.method6503(), true, false); // L: 4930
						break;
					case 1:
						if (ObjectComposition.method4028(class25.getWidgetFlags(var0.field2345))) { // L: 4933
							int[] var4 = var0.field2345.method6388(); // L: 4934
							if (var4 != null) { // L: 4935
								PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 4936
								var2.packetBuffer.method9043(var4[0]); // L: 4937
								var2.packetBuffer.method9107(var0.field2345.id); // L: 4938
								var2.packetBuffer.writeInt(var4[1]); // L: 4939
								var2.packetBuffer.writeIntME(var0.field2345.method6386()); // L: 4940
								var2.packetBuffer.method9043(var4[2]); // L: 4941
								var2.packetBuffer.method9132(var0.field2345.childIndex); // L: 4942
								Client.packetWriter.addNode(var2); // L: 4943
							}
						}
					}
				}
			} else if (var0.field2345.type == 12) { // L: 4950
				class314 var3 = var0.field2345.method6392(); // L: 4951
				if (var3 != null && var3.method6139()) { // L: 4952
					switch(var0.field2344) { // L: 4953
					case 0:
						Client.field722.method4179(var0.field2345); // L: 4955
						var3.method6087(true); // L: 4956
						var3.method6126(var0.field2348, var0.field2343, Client.field721.method4229(82), Client.field721.method4229(81)); // L: 4957
						break;
					case 1:
						var3.method6115(var0.field2348, var0.field2343); // L: 4960
					}
				}
			}

		}
	} // L: 4965
}
