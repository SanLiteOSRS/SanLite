import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("at")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ax")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -948191839
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1832568359
	)
	int field4595;

	@ObfuscatedSignature(
		descriptor = "(Lsg;Lpm;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4595 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lqd;",
		garbageValue = "-99"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[Lqd;",
		garbageValue = "-213375432"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	final void method7769(String var1) {
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

		while (var5 % 37L == 0L && var5 != 0L) { // L: 49
			var5 /= 37L;
		}

		String var10 = Frames.base37DecodeLong(var5); // L: 52
		if (var10 == null) { // L: 53
			var10 = "";
		}

		this.name = var10; // L: 56
	} // L: 57

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "36"
	)
	final void method7744(String var1) {
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

		String var10 = Frames.base37DecodeLong(var5); // L: 77
		if (var10 == null) { // L: 78
			var10 = "";
		}

		this.owner = var10; // L: 81
	} // L: 82

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-1201250181"
	)
	public final void method7765(Buffer var1, int var2) {
		this.method7744(var1.readStringCp1252NullTerminated()); // L: 85
		long var3 = var1.readLong(); // L: 86
		long var6 = var3; // L: 88
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 90
			if (var3 % 37L == 0L) { // L: 94
				var5 = null; // L: 95
			} else {
				var8 = 0; // L: 98

				for (long var9 = var3; 0L != var9; var9 /= 37L) { // L: 99 100 102
					++var8; // L: 101
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 104

				while (var6 != 0L) { // L: 105
					long var12 = var6; // L: 106
					var6 /= 37L; // L: 107
					var11.append(class386.base37Table[(int)(var12 - var6 * 37L)]); // L: 108
				}

				var5 = var11.reverse().toString(); // L: 110
			}
		} else {
			var5 = null; // L: 91
		}

		this.method7769(var5); // L: 112
		this.minKick = var1.readByte(); // L: 113
		short var14;
		if (var2 == 1) { // L: 116
			var8 = var1.readUnsignedByte(); // L: 117
			var14 = 255; // L: 118
		} else {
			if (var2 != 2) { // L: 120
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 125
			}

			var8 = var1.method8980(); // L: 121
			var14 = -1; // L: 122
		}

		if (var8 != var14) { // L: 127
			int var10 = var8; // L: 130
			this.clear(); // L: 131

			for (int var15 = 0; var15 < var10; ++var15) { // L: 132
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 133
				int var13 = var1.readUnsignedShort(); // L: 134
				var16.set(var13, ++this.field4595 - 1); // L: 135
				var16.rank = var1.readByte(); // L: 136
				var1.readStringCp1252NullTerminated(); // L: 137
				this.isLocalPlayer(var16); // L: 138
			}

		}
	} // L: 128 140

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "959704355"
	)
	public final void method7746(Buffer var1) {
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

			var6.set(var3, ++this.field4595 - 1); // L: 162
			var6.rank = var4; // L: 163
			this.isLocalPlayer(var6); // L: 164
		}

	} // L: 166

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "114"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 169
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 170
		}

	} // L: 172

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1704883229"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 175
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 176
		}

	} // L: 178

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)V",
		garbageValue = "1439131573"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 181
			this.rank = var1.rank;
		}

	} // L: 182
}
