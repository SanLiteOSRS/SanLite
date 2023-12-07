import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("hh")
	static String field4677;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("ab")
	@Export("owner")
	public String owner;
	@ObfuscatedName("au")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1177118877
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1705938395
	)
	int field4676;

	@ObfuscatedSignature(
		descriptor = "(Ltt;Lqz;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4676 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lrf;",
		garbageValue = "794695059"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lrf;",
		garbageValue = "-190310061"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2021517341"
	)
	final void method8085(String var1) {
		this.name = class128.method3069(var1); // L: 35
	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "111"
	)
	final void method8086(String var1) {
		this.owner = class128.method3069(var1); // L: 39
	} // L: 40

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "103"
	)
	public final void method8087(Buffer var1, int var2) {
		this.method8086(var1.readStringCp1252NullTerminated()); // L: 43
		long var3 = var1.readLong(); // L: 44
		long var6 = var3; // L: 46
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 48
			if (var3 % 37L == 0L) { // L: 52
				var5 = null; // L: 53
			} else {
				var8 = 0; // L: 56

				for (long var9 = var3; 0L != var9; var9 /= 37L) { // L: 57 58 60
					++var8; // L: 59
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 62

				while (var6 != 0L) { // L: 63
					long var12 = var6; // L: 64
					var6 /= 37L; // L: 65
					var11.append(class400.base37Table[(int)(var12 - 37L * var6)]); // L: 66
				}

				var5 = var11.reverse().toString(); // L: 68
			}
		} else {
			var5 = null; // L: 49
		}

		this.method8085(var5); // L: 70
		this.minKick = var1.readByte(); // L: 71
		short var14;
		if (var2 == 1) { // L: 74
			var8 = var1.readUnsignedByte(); // L: 75
			var14 = 255; // L: 76
		} else {
			if (var2 != 2) { // L: 78
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 83
			}

			var8 = var1.method9277(); // L: 79
			var14 = -1; // L: 80
		}

		if (var8 != var14) { // L: 85
			int var10 = var8; // L: 88
			this.clear(); // L: 89

			for (int var15 = 0; var15 < var10; ++var15) { // L: 90
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 91
				int var13 = var1.readUnsignedShort(); // L: 92
				var16.set(var13, ++this.field4676 - 1);
				var16.rank = var1.readByte(); // L: 94
				var1.readStringCp1252NullTerminated(); // L: 95
				this.isLocalPlayer(var16);
			}

		}
	} // L: 86 98

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-623451894"
	)
	public final void method8088(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort(); // L: 102
		byte var4 = var1.readByte(); // L: 103
		boolean var5 = false; // L: 104
		if (var4 == -128) {
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 106
			if (this.getSize() == 0) {
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

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field4676 - 1); // L: 120
			var6.rank = var4;
			this.isLocalPlayer(var6); // L: 122
		}

	} // L: 124

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1485871297"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 127
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	} // L: 130

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "511267202"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 133
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 134
		}

	} // L: 136

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrp;S)V",
		garbageValue = "-25332"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 139
			this.rank = var1.rank;
		}

	} // L: 140

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-350707745"
	)
	public static char method8113(char var0) {
		switch(var0) { // L: 93
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 101
		case '#':
		case '[':
		case ']':
			return var0; // L: 105
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 159
		case 'Ç':
		case 'ç':
			return 'c'; // L: 162
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 146
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 128
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 121
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 118
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 137
		case 'ß':
			return 'b'; // L: 148
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 96
		default:
			return Character.toLowerCase(var0); // L: 107
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(ILmh;ZI)V",
		garbageValue = "-1919128859"
	)
	static void method8114(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = WorldMapArchiveLoader.getWorldMap().getMapArea(var0); // L: 5338
		int var4 = class229.localPlayer.plane; // L: 5339
		int var5 = class187.baseX * 64 + (class229.localPlayer.x >> 7); // L: 5340
		int var6 = class101.baseY * 64 + (class229.localPlayer.y >> 7); // L: 5341
		Coord var7 = new Coord(var4, var5, var6); // L: 5342
		WorldMapArchiveLoader.getWorldMap().method8794(var3, var7, var1, var2); // L: 5343
	} // L: 5344
}
