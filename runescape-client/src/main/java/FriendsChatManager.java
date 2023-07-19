import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("aw")
	@Export("name")
	public String name;
	@ObfuscatedName("ay")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ap")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -473694643
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -753106791
	)
	int field4622;

	@ObfuscatedSignature(
		descriptor = "(Lsl;Lqa;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4622 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lqh;",
		garbageValue = "-76"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqh;",
		garbageValue = "24"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-6"
	)
	final void method7858(String var1) {
		this.name = Occluder.method4810(var1); // L: 35
	} // L: 36

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "16"
	)
	final void method7859(String var1) {
		this.owner = Occluder.method4810(var1); // L: 39
	} // L: 40

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "2"
	)
	public final void method7855(Buffer var1, int var2) {
		this.method7859(var1.readStringCp1252NullTerminated()); // L: 43
		long var3 = var1.readLong(); // L: 44
		long var6 = var3; // L: 46
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 48
			if (0L == var3 % 37L) { // L: 52
				var5 = null; // L: 53
			} else {
				var8 = 0; // L: 56

				for (long var9 = var3; 0L != var9; var9 /= 37L) { // L: 57 58 60
					++var8; // L: 59
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 62

				while (0L != var6) { // L: 63
					long var12 = var6; // L: 64
					var6 /= 37L; // L: 65
					var11.append(class388.base37Table[(int)(var12 - 37L * var6)]); // L: 66
				}

				var5 = var11.reverse().toString(); // L: 68
			}
		} else {
			var5 = null; // L: 49
		}

		this.method7858(var5); // L: 70
		this.minKick = var1.readByte(); // L: 71
		short var14;
		if (var2 == 1) { // L: 74
			var8 = var1.readUnsignedByte(); // L: 75
			var14 = 255; // L: 76
		} else {
			if (var2 != 2) { // L: 78
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 83
			}

			var8 = var1.method9195(); // L: 79
			var14 = -1; // L: 80
		}

		if (var8 != var14) { // L: 85
			int var10 = var8; // L: 88
			this.clear(); // L: 89

			for (int var15 = 0; var15 < var10; ++var15) { // L: 90
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 91
				int var13 = var1.readUnsignedShort(); // L: 92
				var16.set(var13, ++this.field4622 - 1); // L: 93
				var16.rank = var1.readByte(); // L: 94
				var1.readStringCp1252NullTerminated(); // L: 95
				this.isLocalPlayer(var16); // L: 96
			}

		}
	} // L: 86 98

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "127"
	)
	public final void method7861(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 101
		int var3 = var1.readUnsignedShort(); // L: 102
		byte var4 = var1.readByte(); // L: 103
		boolean var5 = false; // L: 104
		if (var4 == -128) { // L: 105
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 106
			if (this.getSize() == 0) { // L: 107
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 108
			if (var6 != null && var6.getWorld() == var3) { // L: 109
				this.remove(var6); // L: 110
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 114
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 115
			if (var6 == null) { // L: 116
				if (this.getSize() > super.capacity) { // L: 117
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 118
			}

			var6.set(var3, ++this.field4622 - 1); // L: 120
			var6.rank = var4; // L: 121
			this.isLocalPlayer(var6); // L: 122
		}

	} // L: 124

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 127
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 128
		}

	} // L: 130

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1101973544"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 133
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 134
		}

	} // L: 136

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqz;S)V",
		garbageValue = "26931"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 139
			this.rank = var1.rank;
		}

	} // L: 140
}
