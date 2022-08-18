import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("cb")
	static boolean field4305;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("u")
	@Export("name")
	public String name;
	@ObfuscatedName("c")
	@Export("owner")
	public String owner;
	@ObfuscatedName("w")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1510429921
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1038646649
	)
	int field4309;

	@ObfuscatedSignature(
		descriptor = "(Lpa;Lnc;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4309 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lnd;",
		garbageValue = "12"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnd;",
		garbageValue = "-1607059691"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	final void method6653(String var1) {
		String var3 = Script.base37DecodeLong(GrandExchangeOfferAgeComparator.method6010(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3; // L: 41
	} // L: 42

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-799881786"
	)
	final void method6677(String var1) {
		String var3 = Script.base37DecodeLong(GrandExchangeOfferAgeComparator.method6010(var1)); // L: 47
		if (var3 == null) {
			var3 = ""; // L: 48
		}

		this.owner = var3; // L: 51
	} // L: 52

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IB)V",
		garbageValue = "-56"
	)
	public final void method6655(Buffer var1, int var2) {
		this.method6677(var1.readStringCp1252NullTerminated()); // L: 55
		long var3 = var1.readLong(); // L: 56
		this.method6653(GrandExchangeOfferOwnWorldComparator.method1107(var3)); // L: 57
		this.minKick = var1.readByte(); // L: 58
		int var5;
		short var6;
		if (var2 == 1) { // L: 61
			var5 = var1.readUnsignedByte(); // L: 62
			var6 = 255; // L: 63
		} else {
			if (var2 != 2) { // L: 65
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 70
			}

			var5 = var1.method7815(); // L: 66
			var6 = -1; // L: 67
		}

		if (var6 != var5) { // L: 72
			int var7 = var5; // L: 75
			this.clear(); // L: 76

			for (int var8 = 0; var8 < var7; ++var8) { // L: 77
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 78
				int var10 = var1.readUnsignedShort(); // L: 79
				var9.set(var10, ++this.field4309 - 1); // L: 80
				var9.rank = var1.readByte(); // L: 81
				var1.readStringCp1252NullTerminated(); // L: 82
				this.isLocalPlayer(var9); // L: 83
			}

		}
	} // L: 73 85

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqw;S)V",
		garbageValue = "15740"
	)
	public final void method6656(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 88
		int var3 = var1.readUnsignedShort(); // L: 89
		byte var4 = var1.readByte(); // L: 90
		boolean var5 = false; // L: 91
		if (var4 == -128) { // L: 92
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 93
			if (this.getSize() == 0) { // L: 94
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 95
			if (var6 != null && var6.getWorld() == var3) { // L: 96
				this.remove(var6); // L: 97
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 101
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 102
			if (var6 == null) { // L: 103
				if (this.getSize() > super.capacity) { // L: 104
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 105
			}

			var6.set(var3, ++this.field4309 - 1); // L: 107
			var6.rank = var4; // L: 108
			this.isLocalPlayer(var6); // L: 109
		}

	} // L: 111

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2068405661"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 114
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 115
		}

	} // L: 117

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 120
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 121
		}

	} // L: 123

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "-123"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 126
			this.rank = var1.rank;
		}

	} // L: 127

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llc;IIIZB)V",
		garbageValue = "1"
	)
	public static void method6678(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class273.musicPlayerStatus = 1; // L: 32
		class149.musicTrackArchive = var0; // L: 33
		class273.musicTrackGroupId = var1; // L: 34
		UserComparator6.musicTrackFileId = var2; // L: 35
		class273.musicTrackVolume = var3; // L: 36
		class347.musicTrackBoolean = var4; // L: 37
		FaceNormal.pcmSampleLength = 10000; // L: 38
	} // L: 39
}
