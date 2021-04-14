import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -813950429
	)
	static int field3818;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lla;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("b")
	@Export("owner")
	public String owner;
	@ObfuscatedName("e")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1749202535
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1051245869
	)
	int field3824;

	@ObfuscatedSignature(
		signature = "(Lmf;Lla;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3824 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Llt;",
		garbageValue = "-1522637653"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)[Llt;",
		garbageValue = "1232560537"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1170592676"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (var5 % 37L == 0L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = Varcs.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-197094825"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = Varcs.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-872249620"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.readName(class11.method196(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readUnsignedByte();
		if (var4 != 255) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				FriendsChatMember var6 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field3824 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-2086644068"
	)
	public final void method5653(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field3824 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1868427261"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-109"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Lly;I)V",
		garbageValue = "-409410599"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;Ljava/lang/String;Ljava/lang/String;I)Lkq;",
		garbageValue = "762686546"
	)
	public static Font method5655(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2);
		int var5 = var0.getFileId(var4, var3);
		return class236.method4378(var0, var1, var4, var5);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		signature = "(Lhu;I)Z",
		garbageValue = "633331288"
	)
	static final boolean method5644(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4205(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field2225, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
