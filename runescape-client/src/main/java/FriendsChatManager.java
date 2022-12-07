import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("x")
	@Export("name")
	public String name;
	@ObfuscatedName("m")
	@Export("owner")
	public String owner;
	@ObfuscatedName("q")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1090208209
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1853458419
	)
	int field4515;

	@ObfuscatedSignature(
		descriptor = "(Lqi;Lnn;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4515 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lov;",
		garbageValue = "47"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)[Lov;",
		garbageValue = "1710517567"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1741537614"
	)
	final void method7434(String var1) {
		String var3 = ModeWhere.base37DecodeLong(class32.method461(var1)); // L: 37
		if (var3 == null) {
			var3 = ""; // L: 38
		}

		this.name = var3; // L: 41
	} // L: 42

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	final void method7435(String var1) {
		String var3 = ModeWhere.base37DecodeLong(class32.method461(var1)); // L: 47
		if (var3 == null) { // L: 48
			var3 = "";
		}

		this.owner = var3; // L: 51
	} // L: 52

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "-1010256811"
	)
	public final void method7444(Buffer var1, int var2) {
		this.method7435(var1.readStringCp1252NullTerminated()); // L: 55
		long var3 = var1.readLong(); // L: 56
		long var6 = var3; // L: 58
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 60
			if (var3 % 37L == 0L) { // L: 64
				var5 = null; // L: 65
			} else {
				var8 = 0; // L: 68

				for (long var9 = var3; var9 != 0L; var9 /= 37L) { // L: 69 70 72
					++var8; // L: 71
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 74

				while (var6 != 0L) { // L: 75
					long var12 = var6; // L: 76
					var6 /= 37L; // L: 77
					var11.append(class362.base37Table[(int)(var12 - 37L * var6)]); // L: 78
				}

				var5 = var11.reverse().toString(); // L: 80
			}
		} else {
			var5 = null; // L: 61
		}

		this.method7434(var5); // L: 82
		this.minKick = var1.readByte(); // L: 83
		short var14;
		if (var2 == 1) { // L: 86
			var8 = var1.readUnsignedByte(); // L: 87
			var14 = 255; // L: 88
		} else {
			if (var2 != 2) { // L: 90
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 95
			}

			var8 = var1.method8781(); // L: 91
			var14 = -1; // L: 92
		}

		if (var14 != var8) { // L: 97
			int var10 = var8; // L: 100
			this.clear(); // L: 101

			for (int var15 = 0; var15 < var10; ++var15) { // L: 102
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 103
				int var13 = var1.readUnsignedShort(); // L: 104
				var16.set(var13, ++this.field4515 - 1); // L: 105
				var16.rank = var1.readByte(); // L: 106
				var1.readStringCp1252NullTerminated(); // L: 107
				this.isLocalPlayer(var16); // L: 108
			}

		}
	} // L: 98 110

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "109"
	)
	public final void method7437(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 113
		int var3 = var1.readUnsignedShort(); // L: 114
		byte var4 = var1.readByte(); // L: 115
		boolean var5 = false; // L: 116
		if (var4 == -128) { // L: 117
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 118
			if (this.getSize() == 0) { // L: 119
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 120
			if (var6 != null && var6.getWorld() == var3) { // L: 121
				this.remove(var6); // L: 122
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 126
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 127
			if (var6 == null) { // L: 128
				if (this.getSize() > super.capacity) { // L: 129
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 130
			}

			var6.set(var3, ++this.field4515 - 1); // L: 132
			var6.rank = var4; // L: 133
			this.isLocalPlayer(var6); // L: 134
		}

	} // L: 136

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1056288552"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 139
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 140
		}

	} // L: 142

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 145
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 146
		}

	} // L: 148

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Log;I)V",
		garbageValue = "1952671001"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 151
			this.rank = var1.rank;
		}

	} // L: 152

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIIB)V",
		garbageValue = "-79"
	)
	static void method7459(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && StructComposition.clientPreferences.method2506() != 0) { // L: 3449
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3450
				int var4 = var0.soundEffects[var1]; // L: 3451
				if (var4 != 0) { // L: 3455
					int var7 = var4 >> 8; // L: 3456
					int var8 = var4 >> 4 & 7; // L: 3457
					int var9 = var4 & 15; // L: 3458
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3459
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3460
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3461
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3462
					int var10 = (var2 - 64) / 128; // L: 3463
					int var11 = (var3 - 64) / 128; // L: 3464
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3465
					++Client.soundEffectCount; // L: 3466
				}

			}
		}
	} // L: 3468

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1514396714"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		WorldMapSectionType.method5230(); // L: 8738
		Client.menuActions[0] = "Cancel"; // L: 8739
		Client.menuTargets[0] = ""; // L: 8740
		Client.menuOpcodes[0] = 1006; // L: 8741
		Client.menuShiftClick[0] = false; // L: 8742
		Client.menuOptionsCount = 1; // L: 8743
	} // L: 8744
}
