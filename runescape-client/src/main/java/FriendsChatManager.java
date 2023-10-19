import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -1406346729
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ax")
	@Export("name")
	public String name;
	@ObfuscatedName("ao")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ah")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1160213393
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1113279751
	)
	int field4685;

	@ObfuscatedSignature(
		descriptor = "(Lte;Lqc;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4685 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lrp;",
		garbageValue = "1002915738"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrp;",
		garbageValue = "-1086220070"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1282030500"
	)
	final void method7987(String var1) {
		long var5 = 0L; // L: 39
		int var7 = var1.length(); // L: 40

		for (int var8 = 0; var8 < var7; ++var8) { // L: 41
			var5 *= 37L; // L: 42
			char var9 = var1.charAt(var8); // L: 43
			if (var9 >= 'A' && var9 <= 'Z') { // L: 44
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 45
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 46
			}

			if (var5 >= 177917621779460413L) { // L: 47
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) { // L: 49
			var5 /= 37L;
		}

		String var10 = class163.base37DecodeLong(var5); // L: 52
		if (var10 == null) { // L: 53
			var10 = "";
		}

		this.name = var10; // L: 56
	} // L: 57

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "121"
	)
	final void method7988(String var1) {
		long var5 = 0L; // L: 64
		int var7 = var1.length(); // L: 65

		for (int var8 = 0; var8 < var7; ++var8) { // L: 66
			var5 *= 37L; // L: 67
			char var9 = var1.charAt(var8); // L: 68
			if (var9 >= 'A' && var9 <= 'Z') { // L: 69
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') { // L: 70
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48); // L: 71
			}

			if (var5 >= 177917621779460413L) { // L: 72
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) { // L: 74
			var5 /= 37L;
		}

		String var10 = class163.base37DecodeLong(var5); // L: 77
		if (var10 == null) { // L: 78
			var10 = "";
		}

		this.owner = var10; // L: 81
	} // L: 82

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "795527291"
	)
	public final void method8009(Buffer var1, int var2) {
		this.method7988(var1.readStringCp1252NullTerminated()); // L: 85
		long var3 = var1.readLong(); // L: 86
		this.method7987(class160.method3339(var3)); // L: 87
		this.minKick = var1.readByte(); // L: 88
		int var5;
		short var6;
		if (var2 == 1) { // L: 91
			var5 = var1.readUnsignedByte(); // L: 92
			var6 = 255; // L: 93
		} else {
			if (var2 != 2) { // L: 95
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 100
			}

			var5 = var1.method9220(); // L: 96
			var6 = -1; // L: 97
		}

		if (var5 != var6) { // L: 102
			int var7 = var5; // L: 105
			this.clear(); // L: 106

			for (int var8 = 0; var8 < var7; ++var8) { // L: 107
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 108
				int var10 = var1.readUnsignedShort(); // L: 109
				var9.set(var10, ++this.field4685 - 1); // L: 110
				var9.rank = var1.readByte(); // L: 111
				var1.readStringCp1252NullTerminated(); // L: 112
				this.isLocalPlayer(var9); // L: 113
			}

		}
	} // L: 103 115

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "1748337091"
	)
	public final void method7985(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 118
		int var3 = var1.readUnsignedShort(); // L: 119
		byte var4 = var1.readByte(); // L: 120
		boolean var5 = false; // L: 121
		if (var4 == -128) { // L: 122
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 123
			if (this.getSize() == 0) { // L: 124
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 125
			if (var6 != null && var6.getWorld() == var3) { // L: 126
				this.remove(var6); // L: 127
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 131
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 132
			if (var6 == null) { // L: 133
				if (this.getSize() > super.capacity) { // L: 134
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 135
			}

			var6.set(var3, ++this.field4685 - 1); // L: 137
			var6.rank = var4; // L: 138
			this.isLocalPlayer(var6); // L: 139
		}

	} // L: 141

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 144
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 145
		}

	} // L: 147

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-450328361"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 150
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 151
		}

	} // L: 153

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "0"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 156
			this.rank = var1.rank;
		}

	} // L: 157
}
