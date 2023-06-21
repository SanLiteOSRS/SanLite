import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("FriendsList")
public class FriendsList extends NameableContainer {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static Bounds field4572;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -534786145
	)
	int field4575;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 18
		this.field4575 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1; // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lqm;",
		garbageValue = "328216456"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Friend(); // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqm;",
		garbageValue = "20"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 29
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lun;ZB)Z",
		garbageValue = "11"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IB)V",
		garbageValue = "30"
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
						if (var12 != null && var11 != var12) { // L: 59
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
						var11.int2 = ++this.field4575 - 1; // L: 92
						if (var11.world == -1 && var6 == 0) { // L: 93
							var11.int2 = -(var11.int2 * -1981175651) * 819600821;
						}

						var11.world = var6; // L: 94
					}

					var11.rank = var7; // L: 96
					var11.field4589 = var9; // L: 97
					var11.field4590 = var10; // L: 98
					continue; // L: 99
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 100
			return; // L: 101
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1087298650"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9999
			Widget var0 = class158.getWidgetChild(ScriptFrame.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 10000
			if (var0 != null && var0.onTargetLeave != null) { // L: 10001
				ScriptEvent var1 = new ScriptEvent(); // L: 10002
				var1.widget = var0; // L: 10003
				var1.args = var0.onTargetLeave; // L: 10004
				Clock.runScriptEvent(var1); // L: 10005
			}

			Client.selectedSpellItemId = -1; // L: 10007
			Client.isSpellSelected = false; // L: 10008
			Messages.invalidateWidget(var0); // L: 10009
		}
	} // L: 10010
}
