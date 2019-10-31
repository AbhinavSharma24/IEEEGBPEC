package com.example.ieeegbpec.Fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.ieeegbpec.Activities.EventActivity;
import com.example.ieeegbpec.R;
import com.squareup.picasso.Picasso;

public class EventsFragment extends Fragment {

    @SuppressLint("InflateParams")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_events, null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9;

        imageView1 = view.findViewById(R.id.event1);
        imageView2 = view.findViewById(R.id.event2);
        imageView4 = view.findViewById(R.id.event4);
        imageView5 = view.findViewById(R.id.event5);
        imageView8 = view.findViewById(R.id.event8);

        Picasso.get().load("https://lh3.googleusercontent.com/g_uc3p7nBa24tjR1k0qYiYgFrjzCI-jQVxFPqJi1fe_IdFTbMQDELAj5SgQngxMDllBgZtc_ul43FIW8HAVSYAQ6-cqjcrbhAUZYQ6gRstlmalBB6sBwX3PprwpMjzM-ALSKT4wjm02qEzejv_xbkJbGDoYw1mDhL_zJH46meAEFCuWcX7AmOssLXlFQHxC0J7oLQ-oTne7BaOuOIO1Khs0y-kDDgO5CtVDYcGWIQ1OmFyeLnMGxPBoxnDJ4R6Ec9D1w-uUnDBSdolKrpIwNtqZl8YCkVafo3db0E5xt8mMSIZ1lBPBRjtuNnajIe7V_B5agwo8c1n8UV6G9dMuVj-eWAG0A5xUqjtOKMSi2v9s7Ahg5Li3Uy92wSJA5scxpUIFrdsJssB6TFLXyMYJC3IbDBhqAA2fZcK1oezjJNxkhCszPgA_l4VHqDnsfNCMEAx3YjuVIELTk_r0410ThuFx3a5ppsw-fbTlnxefYuDAnSrLNbHaPb_-s7sRRyJJbA4Sz4ncjJElU1eWtlwOD1FHVPXt_8BP5cGyEd0bv9YG9MqHr1FlN0vk_KK9UGQvG6Hbu0daSS0-cED8NHR1qxrhYw1D0xuutrsjEMayM1Esq03U1BaWdLvKR1h0UnsInPVyQT3xfvljMURRNj_jjv609yaIjxBHaj3EtU5fYjpsK6_9Dd4BlvJs=w502-h287-no").fit().centerCrop().into(imageView1);
        Picasso.get().load("https://lh3.googleusercontent.com/LMBiPATgiArmiXG08bHnl5L5BXAvcKZoZzXLm2Dd4drnyx8xgx2g3_89Gqexdx6DCS9XABqSMvtzPkX9d5axfrhw0MTVP_96Ey7ojnkpPdfqLXp_7VApEvwIW-qqSKeyEfpYIOTsD_Des6H2h65SRDJvhbhTJk03hBIKl_lfOR3hFypoQ4DxWIZrBGtdYXpSQ0Rb658AhQzE4RkhMo4r7hi_9F8mBn2PCfBHfk1fHiZ65i7BBTOKV7T3dV_bq5Ac8fA4AH5ncG2U0atKybLVjufLljqosWXJPzyNNSxdSPG7ckamLV9Q3WVPfbMPreCeIXHIk1PFoXjDowkLTgyvx7Kpgt1mk0wuBpAnnnv_Mr9QK1ItxkinsMkD-StKJqFiD8u_BLcmrhVJniPOHPBCBQJmfmEhUgf1t_sbj40gq1VrPYIQj1bLQ16Z_tPWFcIRQFR75Qg9XmC-Z4jrvMeC11TqRIsy4WwF6POmB0ySWYt2szrctFuvOTx6-rihFjmI6-HZWCBJvU1syt21QhS-O__NERlpWFQyIFVpIBfDojz79gwPpCGDL3xnsTu5zuBpfg1TeoIYJ2v2NzcYRNNEJkny-Q5DJXR9OU4eIY9qrrQc9tApg6fix-jG_GHfm0OrYGy8ckrIQn3PnUD0CTo2yG6OCwy9CBtpo6mJq0nXd554YZHGuudXCU4=w1280-h721-no").fit().centerCrop().into(imageView2);
        Picasso.get().load("https://lh3.googleusercontent.com/sB4BWyqX0a-C_uNPzAFaZZgYpfMhFWVa05NixwyO_HBGHFGG9F7tg--1b2FixU-riGK96eRbrJ8UAsq7DLvb5sK4RFspAkH3wLESZrP5PvjHqvbKAKRdS2lqQ-Mx1pU50W7L73_oPvhGXZAbCP7ORDoGrv0SI4mDXFYcrdR-CxhF9XlD1FVr_Jg8Kdq2bpDm5bwpQ50bmBO6aEE7q15filYa8Tx81lYjFWIzE6CLDSiWoCydE93hvD6-c_34Bt64xzyHbSGQXOA7qRR1AkCLTzdeyaesj_dx7zEsGG_tMyJGBVPMLiLLQb67ZONXQcC9a5TvJrYfypjEuA9OHVQnijxrPPwkFlCOcKiWrOfkQIP7cLY2kCuobbUMTjj8HWDaN1k7EoQxrwEr_opcyXL8_Qui6Xk84ZkiE74PivERV5la0gBw5TdV_kaocCPdNg6hc9hHRFRL75mMSOFyZsLs0I7EhITpDNaeitxRXV8kyKcEFTnQUtYQWZVhmNNSK8UEH0Rql6ea-qydP7LTb2ocIE_cddnGoW1Tyb_Qx95L9o7EaI8NUgfTOxNIUWT8IgxZexYenFp--nJp0eKXAgMlt7gKW8-4T0YC9BHSILXjPrECu_tEnreNQw-UAf1AePbMp_gJTB54gF41737sd4uFtXgtB-l6p7tB-IHgg0vQ02kl7Yt0tzND3cY=w708-h374-no").fit().centerCrop().into(imageView4);
        Picasso.get().load("https://lh3.googleusercontent.com/K7_R7MkGNWO0SMp3X1OcjszpBVJT4-hU8QM1L3POADdAf85YuI4IO2rjTwAWgkUg3dQpVdsqdX4Osw5WMaHzBj5lr6_2XOneapar0WGOa3xf51UkJI1x_zp3Up9UHSG8fcbWOKeNV0qDPKNxzHl1qegpPDMRVNDVxHX8FYY3I8-6R3oAQrxWx97wHZEbIdEmhWVa7S4RCvSq9MUd4Ul9DsRNKzkN9TEOr10usQiq1UBFcZm9rE4zQ16fVWPt2laQYwqod5GVcS7CcTqe3G1vev-SiQM1Q9zi58-2atKJVr-P2nlxo6gcNPciZVrwtUkEbVKkYpd9CGpcCC4six1i1fSalfVEKjzsGe67um0Mp3ybbnUjlj-fTi8JmrxYHdhuqPefboa6NP5Gnpj0Bmv0monKdvCes8oHublalfRDGC0b6Q-3tZrC1Tn-Yjh0rDt5X7d0Gzw2dqSE74QH1y4ZB7bolZ2qeusCuhzfQhfm-qw2rX7347oGXl8R-uR7YGeJXdLPba88X8DjrGUDPwe73JekthKxdSPtsRPSJ29MkGNgkLxpH77TFArX8oudni-1jPZF3DakBaXWNQ1w9gRuB0qMpCQrre5sD0eB5ItHNbf5RliQlttV11w-h5Wea9ag8f0mLK3KOsdQuLZmlmOAwc6YMxI8vesZyMIK91fVH6IBTiPqEyR22mM=w1138-h576-no").fit().centerCrop().into(imageView5);
        Picasso.get().load("https://lh3.googleusercontent.com/iSyp0ZyP-MQ7YWPfUOuCEI92yVsSPk0d09mCM1PakZoZUAW2fETzmh1LB_311e-I7esWZsTbG2vOKT3ZZlbWffAPm2ho0EeUXmHQvIKa10mUWK-k_0uhUGq1AL_5g5SEDMmzOKnn6wXMq0mV-l2nNlur0MDW11kjl7LXKZ8jPTFBPSDNz2Vt2uR18-SrsTiCT5eDgxfKDeBlJam0xuWtbRQaR5KTVjyknOpsiDDbOY-V9oyWmketgAqKbIa-z1Jvdzp1aGZ6nR4aQMLx_h1MTxJz2WDbAfb3bku6DYCvAfRuuGm3NmhW2ky66E0KQ6tn1RL2br8wiY1Wq7h-CHpmWp-Pg7-BUwGXbJJmMm4WCWV-lDJSsyJ2i9mH-fV8DKg8QaE5OrZjcC9-TCNBo0orodQN755QSinZsbf8MS1_8o5a04NCjBCGBNnPnBVASmrxDGVYrQyAQKEoGCUxNmAf7XkUJi3hoapkcv-jy6Xk7mFzO-9b_cw36Eg8mE-ZbUsUYWFPjW98GtLl9auah07CUiLFa0IWlAmOru_LZo1jPEt621DPiYjXB_wPzTb6vhXbHaVN7gCfCITtb7i1HUsg-Tl_NJspEHFvYwq2XDZqpFLPAfS__XzqCj-7CNhv8QTx0t0X2WluSb3WNo2SVhftMqlLNJK0w6kPShiq6XSkpdHsuliJbZ-EdEw=w455-h233-no").centerCrop().fit().into(imageView8);

        final CardView cardView1 = view.findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "1");
                startActivity(intent);
            }
        });

        final CardView cardView2 = view.findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "2");
                startActivity(intent);
            }
        });

        final CardView cardView3 = view.findViewById(R.id.card3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "3");
                startActivity(intent);
            }
        });

        final CardView cardView4 = view.findViewById(R.id.card4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "4");
                startActivity(intent);
            }
        });

        final CardView cardView5 = view.findViewById(R.id.card5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "5");
                startActivity(intent);
            }
        });

        final CardView cardView6 = view.findViewById(R.id.card6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "6");
                startActivity(intent);
            }
        });

        final CardView cardView7 = view.findViewById(R.id.card7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "7");
                startActivity(intent);
            }
        });

        final CardView cardView8 = view.findViewById(R.id.card8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "8");
                startActivity(intent);
            }
        });

        final CardView cardView9 = view.findViewById(R.id.card9);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventActivity.class);
                intent.putExtra("eventNo", "9");
                startActivity(intent);
            }
        });
    }
}
