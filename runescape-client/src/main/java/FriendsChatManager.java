import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("am")
	@Export("name")
	public String name;
	@ObfuscatedName("as")
	@Export("owner")
	public String owner;
	@ObfuscatedName("aj")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1945538007
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1246827895
	)
	int field4639;

	@ObfuscatedSignature(
		descriptor = "(Lsi;Lqv;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4639 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Lqe;",
		garbageValue = "3401"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqe;",
		garbageValue = "7"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1311029407"
	)
	final void method7891(String var1) {
		this.name = MusicPatchPcmStream.method6034(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-429338938"
	)
	final void method7892(String var1) {
		this.owner = MusicPatchPcmStream.method6034(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-1516158083"
	)
	public final void method7893(Buffer var1, int var2) {
		this.method7892(var1.readStringCp1252NullTerminated()); // L: 43
		long var3 = var1.readLong();
		long var6 = var3; // L: 46
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) {
			if (var3 % 37L == 0L) { // L: 52
				var5 = null;
			} else {
				var8 = 0;

				for (long var9 = var3; var9 != 0L; var9 /= 37L) { // L: 60
					++var8; // L: 59
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 62

				while (var6 != 0L) {
					long var12 = var6;
					var6 /= 37L;
					var11.append(class389.base37Table[(int)(var12 - 37L * var6)]);
				}

				var5 = var11.reverse().toString();
			}
		} else {
			var5 = null;
		}

		this.method7891(var5); // L: 70
		this.minKick = var1.readByte(); // L: 71
		short var14;
		if (var2 == 1) {
			var8 = var1.readUnsignedByte();
			var14 = 255;
		} else {
			if (var2 != 2) { // L: 78
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 83
			}

			var8 = var1.method9261();
			var14 = -1;
		}

		if (var8 != var14) { // L: 85
			int var10 = var8; // L: 88
			this.clear(); // L: 89

			for (int var15 = 0; var15 < var10; ++var15) { // L: 90
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 91
				int var13 = var1.readUnsignedShort(); // L: 92
				var16.set(var13, ++this.field4639 - 1); // L: 93
				var16.rank = var1.readByte(); // L: 94
				var1.readStringCp1252NullTerminated(); // L: 95
				this.isLocalPlayer(var16); // L: 96
			}

		}
	} // L: 86 98

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "808649523"
	)
	public final void method7903(Buffer var1) {
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

			var6.set(var3, ++this.field4639 - 1); // L: 120
			var6.rank = var4; // L: 121
			this.isLocalPlayer(var6); // L: 122
		}

	} // L: 124

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-157826721"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 127
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 128
		}

	} // L: 130

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 133
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 134
		}

	} // L: 136

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;B)V",
		garbageValue = "115"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 139
			this.rank = var1.rank;
		}

	} // L: 140

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lsi;I)Ljava/lang/String;",
		garbageValue = "-1798627336"
	)
	public static String method7912(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 32
			return null;
		} else {
			int var2 = 0; // L: 33

			int var3;
			for (var3 = var0.length(); var2 < var3 && WorldMapArea.method5212(var0.charAt(var2)); ++var2) { // L: 34 35
			}

			while (var3 > var2 && WorldMapArea.method5212(var0.charAt(var3 - 1))) { // L: 36
				--var3;
			}

			int var4 = var3 - var2; // L: 37
			if (var4 >= 1 && var4 <= class403.method7631(var1)) { // L: 38
				StringBuilder var5 = new StringBuilder(var4); // L: 39

				for (int var6 = var2; var6 < var3; ++var6) { // L: 40
					char var7 = var0.charAt(var6); // L: 41
					boolean var8;
					if (Character.isISOControl(var7)) { // L: 44
						var8 = false; // L: 45
					} else if (class126.isAlphaNumeric(var7)) { // L: 48
						var8 = true; // L: 49
					} else {
						char[] var9 = class494.field4999; // L: 53
						int var10 = 0;

						label77:
						while (true) {
							char var11;
							if (var10 >= var9.length) {
								var9 = class494.field4998; // L: 63

								for (var10 = 0; var10 < var9.length; ++var10) { // L: 64
									var11 = var9[var10]; // L: 65
									if (var11 == var7) { // L: 66
										var8 = true; // L: 67
										break label77; // L: 68
									}
								}

								var8 = false; // L: 72
								break;
							}

							var11 = var9[var10]; // L: 55
							if (var7 == var11) { // L: 56
								var8 = true; // L: 57
								break; // L: 58
							}

							++var10; // L: 54
						}
					}

					if (var8) { // L: 74
						char var12 = class20.method296(var7); // L: 75
						if (var12 != 0) { // L: 76
							var5.append(var12); // L: 77
						}
					}
				}

				if (var5.length() == 0) { // L: 79
					return null;
				} else {
					return var5.toString(); // L: 80
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "256"
	)
	static void method7908(int var0) {
		Client.oculusOrbState = var0; // L: 12846
	} // L: 12847
}
