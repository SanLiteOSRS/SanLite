import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("FriendsList")
public class FriendsList extends NameableContainer {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1954413
	)
	int field3812;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	public FriendsList(LoginType var1) {
		super(400);
		this.field3812 = 1;
		this.friendLoginUpdates = new LinkDeque();
		this.loginType = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Llf;",
		garbageValue = "1590299985"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Friend();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)[Llf;",
		garbageValue = "-1320557093"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Friend[var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;ZB)Z",
		garbageValue = "0"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1);
		if (var3 == null) {
			return false;
		} else {
			return !var2 || var3.world != 0;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "730412999"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				boolean var3 = var1.readUnsignedByte() == 1;
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0;
				boolean var10 = (var8 & 1) != 0;
				if (var6 > 0) {
					var1.readStringCp1252NullTerminated();
					var1.readUnsignedByte();
					var1.readInt();
				}

				var1.readStringCp1252NullTerminated();
				if (var4 != null && var4.hasCleanName()) {
					Friend var11 = (Friend)this.getByCurrentUsername(var4);
					if (var3) {
						Friend var12 = (Friend)this.getByCurrentUsername(var5);
						if (var12 != null && var12 != var11) {
							if (var11 != null) {
								this.remove(var12);
							} else {
								var11 = var12;
							}
						}
					}

					if (var11 != null) {
						this.changeName(var11, var4, var5);
						if (var6 != var11.world) {
							boolean var14 = true;

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
								if (var13.username.equals(var4)) {
									if (var6 != 0 && var13.world == 0) {
										var13.remove();
										var14 = false;
									} else if (var6 == 0 && var13.world != 0) {
										var13.remove();
										var14 = false;
									}
								}
							}

							if (var14) {
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) {
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5);
					}

					if (var6 != var11.world) {
						var11.int2 = ++this.field3812 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * 1083271825) * -286288271;
						}

						var11.world = var6;
					}

					var11.rank = var7;
					var11.field3824 = var9;
					var11.field3825 = var10;
					continue;
				}

				throw new IllegalStateException();
			}

			this.sort();
			return;
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "2200"
	)
	static void method5711(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, LoginScreenAnimation.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class262.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6705(var3[var6]);
					var8.packetBuffer.method6640(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6640(0);
					var8.packetBuffer.method6648(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6649(var3[var6]);
					var8.packetBuffer.method6639(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method6705(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			UserComparator10.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
