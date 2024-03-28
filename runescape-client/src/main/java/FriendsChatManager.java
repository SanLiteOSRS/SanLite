import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("at")
	@Export("name")
	public String name;
	@ObfuscatedName("an")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ao")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 326395263
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -450657103
	)
	int field4781;

	@ObfuscatedSignature(
		descriptor = "(Ltr;Lrd;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4781 = 1; // L: 16
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lrr;",
		garbageValue = "958125629"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lrr;",
		garbageValue = "8"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1466026233"
	)
	final void method8061(String var1) {
		String var3 = ModelData0.base37DecodeLong(class9.method83(var1)); // L: 37
		if (var3 == null) {
			var3 = ""; // L: 38
		}

		this.name = var3; // L: 41
	} // L: 42

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	final void method8062(String var1) {
		String var3 = ModelData0.base37DecodeLong(class9.method83(var1)); // L: 47
		if (var3 == null) {
			var3 = ""; // L: 48
		}

		this.owner = var3; // L: 51
	} // L: 52

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-582457281"
	)
	public final void method8063(Buffer var1, int var2) {
		this.method8062(var1.readStringCp1252NullTerminated()); // L: 55
		long var3 = var1.readLong(); // L: 56
		this.method8061(class204.method3849(var3)); // L: 57
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

			var5 = var1.method9282(); // L: 66
			var6 = -1; // L: 67
		}

		if (var6 != var5) { // L: 72
			int var7 = var5; // L: 75
			this.clear(); // L: 76

			for (int var8 = 0; var8 < var7; ++var8) { // L: 77
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 78
				int var10 = var1.readUnsignedShort(); // L: 79
				var9.set(var10, ++this.field4781 - 1); // L: 80
				var9.rank = var1.readByte(); // L: 81
				var1.readStringCp1252NullTerminated(); // L: 82
				this.isLocalPlayer(var9); // L: 83
			}

		}
	} // L: 73 85

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lur;S)V",
		garbageValue = "-27733"
	)
	public final void method8064(Buffer var1) {
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

			var6.set(var3, ++this.field4781 - 1); // L: 107
			var6.rank = var4; // L: 108
			this.isLocalPlayer(var6); // L: 109
		}

	} // L: 111

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-23993344"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 114
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 115
		}

	} // L: 117

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1982522955"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 120
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 121
		}

	} // L: 123

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lry;I)V",
		garbageValue = "-244184152"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 126
			this.rank = var1.rank;
		}

	} // L: 127

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "659347855"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}
}
