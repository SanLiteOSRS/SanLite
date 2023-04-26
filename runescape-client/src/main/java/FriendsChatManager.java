import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1119961125
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ab")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1788650387
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -835632335
	)
	int field4565;

	@ObfuscatedSignature(
		descriptor = "(Lsw;Lpt;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4565 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lpw;",
		garbageValue = "1756938494"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[Lpw;",
		garbageValue = "-463450295"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "455982360"
	)
	final void method7774(String var1) {
		this.name = SecureRandomFuture.method2130(var1); // L: 35
	} // L: 36

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-951582244"
	)
	final void method7781(String var1) {
		this.owner = SecureRandomFuture.method2130(var1); // L: 39
	} // L: 40

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "1"
	)
	public final void method7776(Buffer var1, int var2) {
		this.method7781(var1.readStringCp1252NullTerminated()); // L: 43
		long var3 = var1.readLong(); // L: 44
		this.method7774(class244.method5045(var3)); // L: 45
		this.minKick = var1.readByte(); // L: 46
		int var5;
		short var6;
		if (var2 == 1) { // L: 49
			var5 = var1.readUnsignedByte(); // L: 50
			var6 = 255; // L: 51
		} else {
			if (var2 != 2) { // L: 53
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 58
			}

			var5 = var1.method9073(); // L: 54
			var6 = -1; // L: 55
		}

		if (var5 != var6) { // L: 60
			int var7 = var5; // L: 63
			this.clear(); // L: 64

			for (int var8 = 0; var8 < var7; ++var8) { // L: 65
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 66
				int var10 = var1.readUnsignedShort(); // L: 67
				var9.set(var10, ++this.field4565 - 1); // L: 68
				var9.rank = var1.readByte(); // L: 69
				var1.readStringCp1252NullTerminated(); // L: 70
				this.isLocalPlayer(var9); // L: 71
			}

		}
	} // L: 61 73

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "-85"
	)
	public final void method7780(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 76
		int var3 = var1.readUnsignedShort(); // L: 77
		byte var4 = var1.readByte(); // L: 78
		boolean var5 = false; // L: 79
		if (var4 == -128) { // L: 80
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 81
			if (this.getSize() == 0) { // L: 82
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 83
			if (var6 != null && var6.getWorld() == var3) { // L: 84
				this.remove(var6); // L: 85
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 89
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 90
			if (var6 == null) { // L: 91
				if (this.getSize() > super.capacity) { // L: 92
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 93
			}

			var6.set(var3, ++this.field4565 - 1); // L: 95
			var6.rank = var4; // L: 96
			this.isLocalPlayer(var6); // L: 97
		}

	} // L: 99

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1667948273"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 102
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 103
		}

	} // L: 105

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 108
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 109
		}

	} // L: 111

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-1829447137"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 114
			this.rank = var1.rank;
		}

	} // L: 115

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1848509736"
	)
	static final void method7771(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8627
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8628
				Client.field706[var4] = true;
			}
		}

	} // L: 8630
}
