import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("as")
	@Export("name")
	public String name;
	@ObfuscatedName("ax")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ap")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -993674261
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 201437221
	)
	int field4588;

	@ObfuscatedSignature(
		descriptor = "(Lsj;Lpf;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4588 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lqm;",
		garbageValue = "328216456"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqm;",
		garbageValue = "20"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-81"
	)
	final void method7747(String var1) {
		String var3 = MusicPatchPcmStream.base37DecodeLong(class161.method3326(var1)); // L: 37
		if (var3 == null) {
			var3 = ""; // L: 38
		}

		this.name = var3; // L: 41
	} // L: 42

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2122581535"
	)
	final void method7748(String var1) {
		String var3 = MusicPatchPcmStream.base37DecodeLong(class161.method3326(var1)); // L: 47
		if (var3 == null) {
			var3 = ""; // L: 48
		}

		this.owner = var3; // L: 51
	} // L: 52

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "972044177"
	)
	public final void method7749(Buffer var1, int var2) {
		this.method7748(var1.readStringCp1252NullTerminated()); // L: 55
		long var3 = var1.readLong(); // L: 56
		this.method7747(MusicPatchPcmStream.method5943(var3)); // L: 57
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

			var5 = var1.method8938(); // L: 66
			var6 = -1; // L: 67
		}

		if (var6 != var5) { // L: 72
			int var7 = var5; // L: 75
			this.clear(); // L: 76

			for (int var8 = 0; var8 < var7; ++var8) { // L: 77
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 78
				int var10 = var1.readUnsignedShort(); // L: 79
				var9.set(var10, ++this.field4588 - 1); // L: 80
				var9.rank = var1.readByte(); // L: 81
				var1.readStringCp1252NullTerminated(); // L: 82
				this.isLocalPlayer(var9); // L: 83
			}

		}
	} // L: 73 85

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "715027763"
	)
	public final void method7768(Buffer var1) {
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

			var6.set(var3, ++this.field4588 - 1); // L: 107
			var6.rank = var4; // L: 108
			this.isLocalPlayer(var6); // L: 109
		}

	} // L: 111

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16530"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 114
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 115
		}

	} // L: 117

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "648814275"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 120
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 121
		}

	} // L: 123

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqb;B)V",
		garbageValue = "0"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 126
			this.rank = var1.rank;
		}

	} // L: 127
}
