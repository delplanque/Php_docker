FROM php:7.2-fpm

RUN apt-get update

RUN docker-php-ext-install mysqli && docker-php-ext-enable mysqli


