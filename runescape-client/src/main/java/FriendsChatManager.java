import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("v")
	@Export("name")
	public String name;
	@ObfuscatedName("c")
	@Export("owner")
	public String owner;
	@ObfuscatedName("q")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1509260973
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -986186667
	)
	int field4291;

	@ObfuscatedSignature(
		descriptor = "(Lpl;Lne;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4291 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "1043377845"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnb;",
		garbageValue = "46467081"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-429965392"
	)
	final void method6551(String var1) {
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

		String var10 = Huffman.base37DecodeLong(var5); // L: 52
		if (var10 == null) { // L: 53
			var10 = "";
		}

		this.name = var10; // L: 56
	} // L: 57

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "62"
	)
	final void method6554(String var1) {
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

		while (var5 % 37L == 0L && 0L != var5) { // L: 74
			var5 /= 37L;
		}

		String var10 = Huffman.base37DecodeLong(var5); // L: 77
		if (var10 == null) { // L: 78
			var10 = "";
		}

		this.owner = var10; // L: 81
	} // L: 82

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-1186412773"
	)
	public final void method6553(Buffer var1, int var2) {
		this.method6554(var1.readStringCp1252NullTerminated()); // L: 85
		long var3 = var1.readLong(); // L: 86
		long var6 = var3; // L: 88
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 90
			if (0L == var3 % 37L) { // L: 94
				var5 = null; // L: 95
			} else {
				var8 = 0; // L: 98

				for (long var9 = var3; var9 != 0L; var9 /= 37L) { // L: 99 100 102
					++var8; // L: 101
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 104

				while (var6 != 0L) { // L: 105
					long var12 = var6; // L: 106
					var6 /= 37L; // L: 107
					var11.append(class345.base37Table[(int)(var12 - 37L * var6)]); // L: 108
				}

				var5 = var11.reverse().toString(); // L: 110
			}
		} else {
			var5 = null; // L: 91
		}

		this.method6551(var5); // L: 112
		this.minKick = var1.readByte(); // L: 113
		short var14;
		if (var2 == 1) { // L: 116
			var8 = var1.readUnsignedByte(); // L: 117
			var14 = 255; // L: 118
		} else {
			if (var2 != 2) { // L: 120
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 125
			}

			var8 = var1.method7706(); // L: 121
			var14 = -1; // L: 122
		}

		if (var14 != var8) { // L: 127
			int var10 = var8; // L: 130
			this.clear(); // L: 131

			for (int var15 = 0; var15 < var10; ++var15) { // L: 132
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 133
				int var13 = var1.readUnsignedShort(); // L: 134
				var16.set(var13, ++this.field4291 - 1); // L: 135
				var16.rank = var1.readByte(); // L: 136
				var1.readStringCp1252NullTerminated(); // L: 137
				this.isLocalPlayer(var16); // L: 138
			}

		}
	} // L: 128 140

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "750050170"
	)
	public final void method6556(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 143
		int var3 = var1.readUnsignedShort(); // L: 144
		byte var4 = var1.readByte(); // L: 145
		boolean var5 = false; // L: 146
		if (var4 == -128) { // L: 147
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 148
			if (this.getSize() == 0) { // L: 149
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 150
			if (var6 != null && var6.getWorld() == var3) { // L: 151
				this.remove(var6); // L: 152
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 156
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 157
			if (var6 == null) { // L: 158
				if (this.getSize() > super.capacity) { // L: 159
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 160
			}

			var6.set(var3, ++this.field4291 - 1); // L: 162
			var6.rank = var4; // L: 163
			this.isLocalPlayer(var6); // L: 164
		}

	} // L: 166

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1186289190"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 169
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 170
		}

	} // L: 172

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711305340"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 175
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 176
		}

	} // L: 178

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnp;S)V",
		garbageValue = "1982"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 181
			this.rank = var1.rank;
		}

	} // L: 182
}
