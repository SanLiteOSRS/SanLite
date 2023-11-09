import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("at")
	@Export("name")
	public String name;
	@ObfuscatedName("ac")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ai")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 106239799
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -727783247
	)
	int field4638;

	@ObfuscatedSignature(
		descriptor = "(Lsl;Lql;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4638 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lqs;",
		garbageValue = "-1997275235"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqs;",
		garbageValue = "99"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1793987000"
	)
	final void method7835(String var1) {
		this.name = class385.method7165(var1); // L: 35
	} // L: 36

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1839249281"
	)
	final void method7836(String var1) {
		this.owner = class385.method7165(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1203512341"
	)
	public final void method7837(Buffer var1, int var2) {
		this.method7836(var1.readStringCp1252NullTerminated()); // L: 43
		long var3 = var1.readLong();
		long var6 = var3;
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) {
			if (var3 % 37L == 0L) {
				var5 = null;
			} else {
				var8 = 0;

				for (long var9 = var3; 0L != var9; var9 /= 37L) { // L: 57
					++var8;
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 62

				while (var6 != 0L) { // L: 63
					long var12 = var6; // L: 64
					var6 /= 37L; // L: 65
					var11.append(class388.base37Table[(int)(var12 - var6 * 37L)]); // L: 66
				}

				var5 = var11.reverse().toString(); // L: 68
			}
		} else {
			var5 = null;
		}

		this.method7835(var5); // L: 70
		this.minKick = var1.readByte(); // L: 71
		short var14;
		if (var2 == 1) { // L: 74
			var8 = var1.readUnsignedByte(); // L: 75
			var14 = 255; // L: 76
		} else {
			if (var2 != 2) { // L: 78
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 83
			}

			var8 = var1.method9075(); // L: 79
			var14 = -1; // L: 80
		}

		if (var14 != var8) { // L: 85
			int var10 = var8; // L: 88
			this.clear(); // L: 89

			for (int var15 = 0; var15 < var10; ++var15) { // L: 90
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 91
				int var13 = var1.readUnsignedShort(); // L: 92
				var16.set(var13, ++this.field4638 - 1); // L: 93
				var16.rank = var1.readByte(); // L: 94
				var1.readStringCp1252NullTerminated(); // L: 95
				this.isLocalPlayer(var16); // L: 96
			}

		}
	} // L: 86 98

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-59"
	)
	public final void method7838(Buffer var1) {
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

			var6.set(var3, ++this.field4638 - 1); // L: 120
			var6.rank = var4; // L: 121
			this.isLocalPlayer(var6); // L: 122
		}

	} // L: 124

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 127
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 128
		}

	} // L: 130

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 133
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 134
		}

	} // L: 136

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqx;I)V",
		garbageValue = "-617315153"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 139
			this.rank = var1.rank;
		}

	} // L: 140

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-652647003"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIILiv;[Lis;I)V",
		garbageValue = "420755705"
	)
	static final void method7860(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 247
		int var6 = -1; // L: 248

		while (true) {
			int var7 = var5.method9076(); // L: 250
			if (var7 == 0) { // L: 251
				return; // L: 275
			}

			var6 += var7; // L: 252
			int var8 = 0; // L: 253

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 255
				if (var9 == 0) { // L: 256
					break;
				}

				var8 += var9 - 1; // L: 257
				int var10 = var8 & 63; // L: 258
				int var11 = var8 >> 6 & 63; // L: 259
				int var12 = var8 >> 12; // L: 260
				int var13 = var5.readUnsignedByte(); // L: 261
				int var14 = var13 >> 2; // L: 262
				int var15 = var13 & 3; // L: 263
				int var16 = var11 + var1; // L: 264
				int var17 = var10 + var2; // L: 265
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 266
					int var18 = var12; // L: 267
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 268
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 269
					if (var18 >= 0) { // L: 270
						var19 = var4[var18];
					}

					class128.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 271
				}
			}
		}
	}
}
